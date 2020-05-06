package com.vcs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vcs.action.StudentService;
import com.vcs.hibernate.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service=(StudentService) context.getBean("studentService");
		Student student=new Student();
		student.setStudentNo(1);
		student.setStudentName("suresh");
		service.insertStudent(student);
	}

}
