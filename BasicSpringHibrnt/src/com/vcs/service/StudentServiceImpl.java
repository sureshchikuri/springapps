package com.vcs.service;

import com.vcs.dao.StudentDao;
import com.vcs.pojo.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public String insertStudent(Student student2) {

		String status=null;
		
		status=studentDao.insertStudent(student2);
		return status;
	}
}
