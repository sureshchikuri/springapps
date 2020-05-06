package com.vcs.emp;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String empId;
	private String empName;
	private String empSal;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String execute() {

		System.out.println("insert");

		return "success";
	}

	

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpSal() {
		return empSal;
	}

}
