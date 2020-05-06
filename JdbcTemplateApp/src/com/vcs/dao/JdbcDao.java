package com.vcs.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class JdbcDao {

	private PreparedStatementCreator creator;
	private PreparedStatementCallback callback;
	private JdbcTemplate template;
	
	public PreparedStatementCreator getCreator() {
		return creator;
	}
	public void setCreator(PreparedStatementCreator creator) {
		this.creator = creator;
	}
	public PreparedStatementCallback getCallback() {
		return callback;
	}
	public void setCallback(PreparedStatementCallback callback) {
		this.callback = callback;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	
	public void getStudent(){
		
		List studentList;
		
		studentList=(List) template.execute(creator, callback);
		
	}
	
}
