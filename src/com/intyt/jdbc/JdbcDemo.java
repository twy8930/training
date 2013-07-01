package com.intyt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC演示
 * 
 * @author twy
 * 
 */
public class JdbcDemo {
	
	static{
		// 加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/play_test", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(name + " " + age);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
