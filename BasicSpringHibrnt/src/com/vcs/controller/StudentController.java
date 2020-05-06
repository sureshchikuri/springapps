package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sun.org.apache.commons.beanutils.BeanUtils;
import com.vcs.model.StudentCommand;
import com.vcs.pojo.Student;
import com.vcs.service.StudentService;

public class StudentController extends SimpleFormController {

	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		StudentCommand student = new StudentCommand();

		student.setStudentNo("111");

		return student;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		StudentCommand student = (StudentCommand) command;
		Student student2=new Student();
		String status = null;

		BeanUtils.copyProperties(student2, student);
		
		status = studentService.insertStudent(student2);
		System.out.println(status);
		return new ModelAndView("success");
	}
}
