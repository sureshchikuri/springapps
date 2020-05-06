package com.vcs.test;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {

	
	public static void main(String[] args) {
		
		
		Student student=new Student();
		student.setSno("232");
		student.setSname("suresh");
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		
		session.save(student);
	}
}
