package com.ws.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.spring.model.Employee;
import com.ws.spring.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
    @RequestMapping(value="/create",method=RequestMethod.POST)
    public String hello(Employee emp, @RequestParam(value="name", required=false, defaultValue="sri") String name,@RequestParam(value="dept", required=false, defaultValue="World") String dept) {
    	
    	String result;
    	
    	emp.setName(name);
        emp.setDept(dept);
        
       result= empService.createEmployee(emp);
        
        
        return "hello";
    }
}