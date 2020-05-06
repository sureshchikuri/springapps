package com.vcs.java.dao;

import java.util.List;

import com.vcs.java.model.Student;

public interface StudentDao {

	public void saveOrUpdate(Student student);

	public void delete(int contactId);

	public Student get(int contactId);

	public List<Student> list();

}
