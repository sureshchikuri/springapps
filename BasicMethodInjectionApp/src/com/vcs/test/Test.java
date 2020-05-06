package com.vcs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vcs.service.Service;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Service service1=(Service) context.getBean("service");
		Service service2=(Service) context.getBean("service");
		service1.getDao();
		service2.getDao();
		
		System.out.println(service1);
		System.out.println(service2);
	}

}
