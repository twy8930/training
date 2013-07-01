package com.intyt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库工具类
 * 
 * @author twy
 * 
 */
public class DBUtil {

	private Connection conn;
	private Statement st;
	private PreparedStatement pps;
	private ResultSet rs;
	public String url = "jdbc:mysql://localhost:3306/play_test";
	private String user = "root";
	private String password = "root";

	// 加载驱动、放在静态代码块中，保证驱动在整个项目中只加载一次，提高效率
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取连接的方法
	 * 
	 * @return Connection 一个有效的数据库连接
	 */
	public Connection getConnection() {
		try {
			// 注意链接时，要换成自己的数据库名，数据库用户名及密码
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 用于执行更新的方法,包括（insert delete update）操作
	 * 
	 * @param sql
	 *            String 类型的SQL语句
	 * @return Integer 表示受影响的行数
	 */
	public int update(String sql) {
		// 定义变量用来判断更新操作是否成功，如果返回-1说明没有影响到更新操作的数据库记录条数，即更新操作失败
		int row = -1;
		try {
			// 如果数据库链接被关闭了，就要既得一个新的链接
			if (conn == null || conn.isClosed()) {
				conn = getConnection();
			}
			// 使用Connection对象conn的createStatement()创建Statement（数据库语句对象）st
			st = conn.createStatement();
			// 执行更新操作，返回影响的记录条数row
			row = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return row;
	}

	/**
	 * 基于PreparedStatement的修改方法 PreparedStatement:表示预编译的 SQL 语句的对象
	 * 
	 * @param sql
	 *            String 类型的SQL语句（insert delete update）
	 * @param obj
	 *            存放动态参数的数组
	 * @return Integer 表示受影响的行数
	 */
	public int update(String sql, Object... obj) {
		try {
			// 获取链接
			if (conn == null || conn.isClosed()) {
				conn = getConnection();
			}
			// 创建预编译的 SQL 语句对象
			pps = conn.prepareStatement(sql);
			// 定义变量length代表数组长度，也就是预处理的sql语句中的参数个数
			int length = 0;
			// ParameterMetaData：用于获取关于 PreparedStatement 对象中每个参数的类型和属性信息的对象
			ParameterMetaData pmd = pps.getParameterMetaData();
			length = pmd.getParameterCount();
			// 循环将sql语句中的?设置为obj数组中对应的值，注意从1开始，所以i要加1
			for (int i = 0; i < length; i++) {
				pps.setObject(i + 1, obj[i]);
			}
			// 执行更新操作
			return pps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return -1;
	}

	/**
	 * 关闭数据库各种资源Connection Statement PreparedStatement ResultSet的方法
	 */
	private void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pps != null) {
			try {
				pps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			if (conn != null && !conn.isClosed()) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
