package com.mastercard.employees.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mastercard.employees.service.EmployeeServiceImpl;

public class CORSInterceptor extends HandlerInterceptorAdapter {

	private static Logger log=Logger.getLogger(EmployeeServiceImpl.class);
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		Long startTime=System.currentTimeMillis();
		log.info("START-preHandle()");
		log.info("Request URL::"+request.getRequestURL().toString()+"::Start Time="+System.currentTimeMillis());
		request.setAttribute("startTime", startTime);
		response.addHeader("Access-control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,PUT,DELETE");
		response.addHeader("Access-Control-Max-Age", "3600");
		response.addHeader("Access-Control-Allow-Headers", "x-request-with");
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		log.info("START-postHandle()");
		log
				.info("Request URL::" + request.getRequestURL().toString()
						+ "Sent to Handler::Current Time="
						+ System.currentTimeMillis());
		log.info("End-postHandle()");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		log.info("START-afterCompletion()");
		Long startTime = (Long) request.getAttribute("startTime");
		log.info("afterCompletion()-Request URL::"
				+ request.getRequestURL().toString() + ":: END Time="
				+ System.currentTimeMillis());
		log.info("afterCompletion()-Request URL::"
				+ request.getRequestURL().toString() + ":: Time Taken="
				+ (System.currentTimeMillis() - startTime));
		log.info("End-afterCompletion()");

	}
}
