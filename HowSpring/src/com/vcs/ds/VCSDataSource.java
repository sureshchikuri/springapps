package com.vcs.ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VCSDataSource {


	private String url;
	private String user;
	private String pass;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setDriverClassName(String driverClassName) throws ClassNotFoundException{
		
		Class.forName(driverClassName);
	}
	
	public Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url,user,pass);
		
	}
}
