package com.vcs.java;

import java.util.Map;

public class Department {

	
	private Map sections;

	public Map getSections() {
		return sections;
	}

	public void setSections(Map sections) {
		this.sections = sections;
	}

	public Department(Map sections) {
		super();
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Department [sections=" + sections + "]";
	}
	
	
}
