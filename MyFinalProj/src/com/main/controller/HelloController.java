package com.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.model.Employee;

@Controller
@RequestMapping("/employee")
public class HelloController {
 
  
 
    // CREATE
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloForm() {
    	
        System.out.println("RestServiceController createMovie end");
        return "helloForm";
    }
 
    @RequestMapping(value="/hello",method=RequestMethod.POST)
    public String hello(HttpServletRequest request,Model model) {
    	
    	String name=request.getParameter("name");
    	String dept=request.getParameter("dept");
    	
    	if(name==null || name==""){
    		name="world";
    	}
    	
    	Employee emp =new Employee(name, dept);
    	
    	model.addAttribute("name",name);
    	model.addAttribute("title", "hello spring resp");
    	
        System.out.println("RestServiceController createMovie end");
        return "hello";
    }
    
}