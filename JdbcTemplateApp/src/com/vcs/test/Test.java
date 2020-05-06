package com.vcs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vcs.dao.JdbcDao;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JdbcDao jdbcDao=(JdbcDao) context.getBean("jdbcDao");
		
		jdbcDao.getStudent();
	}
}
