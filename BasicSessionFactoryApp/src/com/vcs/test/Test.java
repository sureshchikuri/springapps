package com.vcs.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		
		System.out.println(sessionFactory.toString());
	}

}
