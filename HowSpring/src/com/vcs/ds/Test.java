package com.vcs.ds;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		VCSDataSource dataSource=new VCSDataSource();
		
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUser("system");
		dataSource.setPass("student");
		
		System.out.println(dataSource.getConnection());
	}

}
