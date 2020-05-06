package com.vcs.java.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vcs.java.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveOrUpdate(Student student) {
	    if (student.getId() > 0) {
	        // update
	        String sql = "UPDATE contact SET  name=?, dept=? WHERE contact_id=?";
	        jdbcTemplate.update(sql, student.getId(), student.getName(),student.getDept());
	    } else {
	        // insert
	        String sql = "INSERT INTO contact (id ,name, dept)"
	                    + " VALUES (?, ?, ?)";
	        jdbcTemplate.update(sql, student.getId(), student.getName(),student.getDept());
	    }
	 
	}

	@Override
	public void delete(int studentId) {
		// TODO Auto-generated method stub
		 String sql = "DELETE FROM student WHERE student_id=?";
		    jdbcTemplate.update(sql, studentId);
	}

	@Override
	public Student get(int studentId) {
		  String sql = "SELECT * FROM contact WHERE contact_id=" + studentId;
		    return jdbcTemplate.query(sql, new ResultSetExtractor<Student>() {
		 
		        @Override
		        public Student extractData(ResultSet rs) throws SQLException,
		                DataAccessException {
		            if (rs.next()) {
		                Student student = new Student();
		                student.setId(rs.getInt("contact_id"));
		                student.setName(rs.getString("name"));
		                student.setDept(rs.getString("dept"));
		                
		                return student;
		            }
		 
		            return null;
		        }
		 
		    });
	}

	@Override
	public List<Student> list() {
		 String sql = "SELECT * FROM Contact";
	     
		    return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
	}

	
	
}
