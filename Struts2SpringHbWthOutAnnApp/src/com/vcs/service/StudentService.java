package com.vcs.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vcs.hibernate.Student;

public class StudentService {

	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insertStudent(Student student){
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
	}
}
