package com.vcs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		VCSDataSource dataSource=(VCSDataSource) context.getBean("jndiName");
		
		System.out.println(dataSource);
	}

}
