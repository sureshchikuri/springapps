package com.vcs.java;

import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private List subjects;

	private Set games;

	public Set getGames() {
		return games;
	}

	public Student(Set games) {
		super();
		this.games = games;
	}

	public void setGames(Set games) {
		this.games = games;
	}

	public Student(List subjects) {
		super();
		this.subjects = subjects;
	}

	public Student(int id, String name, List subjects, Set games) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.games = games;
	}

	public List getSubjects() {
		return subjects;
	}

	public void setSubjects(List subjects) {
		this.subjects = subjects;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", games=" + games + "]";
	}

	
}