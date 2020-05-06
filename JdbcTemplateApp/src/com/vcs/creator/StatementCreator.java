package com.vcs.creator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class StatementCreator implements PreparedStatementCreator {

	@Override
	public PreparedStatement createPreparedStatement(Connection connection)
			throws SQLException {

		String query="SELECT * FROM STUDENT";
		
		PreparedStatement psmt=connection.prepareStatement(query);
		return psmt;
	}

}
