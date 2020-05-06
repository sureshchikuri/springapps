package com.vcs.stu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowmapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub

		Employee emp = new Employee();

		emp.setEmpId(rs.getString("EMPID"));

		emp.setEmpname(rs.getString("EMPNAME"));

		return emp;
	}

}
