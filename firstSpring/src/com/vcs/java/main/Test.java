package com.vcs.java.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vcs.java.College;
import com.vcs.java.Department;
import com.vcs.java.Student;

public class Test {
	public static void main(String[] args) {
		// Resource resource=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(context);
		// Student student=(Student)factory.getBean("studentbean");

	/*	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = (Student) context.getBean("studentbean");

		student.displayInfo();

		System.out.println(student.getId());
		System.out.println(student.getName());*/
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		College college=(College) applicationContext.getBean("collegebean");
		
		System.out.println(college);

		Department dept=(Department) applicationContext.getBean("dept");
		
		System.out.println(dept);
		
		
	}
}