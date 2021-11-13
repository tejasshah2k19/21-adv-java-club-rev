package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/svp";
		String userName = "root";
		String password = "root";
		Connection con = null;
		try {
			Class.forName(driver); // load driver in memory

			con = DriverManager.getConnection(url, userName, password);

			if (con == null) {
				System.out.println("db not connected");
			} else {
				System.out.println("db connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

}
