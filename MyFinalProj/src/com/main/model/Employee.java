package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "Movie")
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="id")
	    private long id;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="dept")
	    private String dept;
	 
	    public Employee() {
	        // nop
	    }
	 
	    public Employee(String name, String dept) {
	        this.name = name;
	        this.dept = dept;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
	 
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		}
	   
	}


