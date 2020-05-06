package com.vcs.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vcs.pojo.Student;


public class StudentDaoImpl extends  HibernateDaoSupport implements StudentDao {

	@Override
	public String insertStudent(Student student2) {

		String status=null;
		
		getSession().save(student2);
		
		status="inserted successfully";
		
		return status;
	}

}
