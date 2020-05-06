package com.vcs.creator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.vcs.model.Student;

public class ExecuteCallBack implements PreparedStatementCallback{

	@Override
	public Object doInPreparedStatement(PreparedStatement psmt)
			throws SQLException, DataAccessException {

		ResultSet rs=psmt.executeQuery();
		
		List studentList=null;
		while (rs.next()) {
			Student student=new Student();
			student.setStudentNo(rs.getInt("sno"));
			student.setStudentName(rs.getString("sname"));
			studentList.add(student);
			
		}
		
		return studentList;
	}

}
