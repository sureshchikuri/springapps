package com.vcs.stu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StudentController extends MultiActionController {
	
	
	
	public ModelAndView insert(HttpServletRequest request,
			HttpServletResponse response,Student student) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(student.getStudentno());
		return new ModelAndView("success");
	}

}
