package com.epam.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection con = null;

	private DBConnection() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hospital", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		if (con == null) {
			new DBConnection();
		}
		return con;
	}
}
