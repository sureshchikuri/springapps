package com.vcs.stu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")
public class StudentController extends SimpleFormController {
	
	private StudentService studentService;
	
	String status=null;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		
		
		
		return super.formBackingObject(request);
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		

		Student1 student = (Student1) command;
		
		status=studentService.insertStudent(student);
		
		//request.setAttribute("status",status);
		
		return new ModelAndView("success");
	}

}
