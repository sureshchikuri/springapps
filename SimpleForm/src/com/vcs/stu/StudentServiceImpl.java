package com.vcs.stu;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	String status=null;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public String insertStudent(Student1 student) {
		// TODO Auto-generated method stub
		
		status=studentDao.insertStudent(student);
		
		return status;

	}

}
