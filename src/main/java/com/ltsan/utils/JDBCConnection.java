package com.ltsan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCConnection {
	public static Connection getJDBCConnection() {
		final String url ="jdbc:mysql://localhost:3306/strutsplayback";
		final String user = "root";
		final String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
}
