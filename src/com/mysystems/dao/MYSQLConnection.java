package com.mysystems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "full2work");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return con;
	}
}
