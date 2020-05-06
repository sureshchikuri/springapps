package com.vcs.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.vcs.hibernate.Student;

public class StudentService {

	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void insertStudent(Student student){
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
	}


}
