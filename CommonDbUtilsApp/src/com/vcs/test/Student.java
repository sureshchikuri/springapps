package com.vcs.test;

public class Student {

	
	private String sname;
	private String sno;
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
}
