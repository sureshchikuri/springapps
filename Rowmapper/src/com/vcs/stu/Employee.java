package com.vcs.stu;

public class Employee {
	
	
	private String empId;
	
	private String empname;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + "]";
	}
	
	

}
