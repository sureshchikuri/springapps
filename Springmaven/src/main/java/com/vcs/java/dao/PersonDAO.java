package com.vcs.java.dao;

import java.util.List;

import com.vcs.java.model.Person;



public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
}
