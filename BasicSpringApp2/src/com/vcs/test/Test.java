package com.vcs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	
	public static void main(String[] args) {

		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		JdbcTemplate jdbcTemplate=(JdbcTemplate) factory.getBean("jdbcTemplate");
		
		jdbcTemplate.update("INSERT INTO STUDENT VALUES(?,?)",new Object[]{"3","kiran"});
	}

}
