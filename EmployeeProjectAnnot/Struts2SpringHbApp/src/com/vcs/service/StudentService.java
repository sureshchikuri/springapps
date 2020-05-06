package com.vcs.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

import com.vcs.hibernate.Student;

public class StudentService {

	AnnotationSessionFactoryBean sessionFactoryBean;
	
	public void setAnnotationSessionFactoryBean(AnnotationSessionFactoryBean sessionFactoryBean){
		this.sessionFactoryBean=sessionFactoryBean;
	}
	
	public void insertStudent(Student student){
		
		Session session=((SessionFactory) sessionFactoryBean).openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
	}
}
