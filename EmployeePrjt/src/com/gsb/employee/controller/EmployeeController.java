package com.gsb.employee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

@SuppressWarnings("deprecation")
public class EmployeeController extends SimpleFormController {

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {

		return super.formBackingObject(request);
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		return super.onSubmit(request, response, command, errors);
	}
}
