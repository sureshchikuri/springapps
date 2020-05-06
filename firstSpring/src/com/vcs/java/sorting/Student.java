package com.vcs.java.sorting;

public class Student implements Comparable<Student>{

	private int rollno;
	
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollno<o.rollno){
			return +1;
		}else if (this.rollno>o.rollno) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	
}
