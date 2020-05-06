package com.vcs.stu;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
	
	
	String status="Insertion done";

	@Override
	public String insertStudent(Student student) {
		// TODO Auto-generated method stub
		
		status=(String) getSession().save(student);
		
		return status;

	}

}
