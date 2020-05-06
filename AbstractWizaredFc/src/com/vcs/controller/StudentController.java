package com.vcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;
import org.springframework.web.servlet.view.RedirectView;

public class StudentController extends AbstractWizardFormController {

	@Override
	protected ModelAndView processFinish(HttpServletRequest raquest,
			HttpServletResponse response, Object command, BindException error)
			throws Exception {

		Student student = (Student) command;

		System.out.println("processFinish");

		return new ModelAndView("success");
	}

	@Override
	protected void validatePage(Object command, Errors errors, int page) {

		StudentValidator studentValidator = (StudentValidator) getValidator();

		if (page == 0) {
			studentValidator.student(command, errors);
		}

		if (page == 1) {
			studentValidator.student1(command, errors);
		}
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		System.out.println("processCancel");
		
		return new ModelAndView(new RedirectView("Studentcontroller.spr"));
	}
	
	/*@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		
		return super.formBackingObject(request);
	}*/
}
