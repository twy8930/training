package com.intyt.dbpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 性能测试
 * @author twy
 *
 */
public class SpeedTest {
	
	public static void main(String[] args) {
		
		try {
			Connection connection = DBConnProvider.getConnection();
			Statement stmt = null;
			try {
				stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("select * from person");
				while (rs.next()) {
					String name = rs.getString("name");
					int age = rs.getInt("age");
					System.out.println(name + " " + age);
				}
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
