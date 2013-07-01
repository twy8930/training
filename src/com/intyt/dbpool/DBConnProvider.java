package com.intyt.dbpool;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 用c3p0提供数据库连接的类
 * @author twy
 *
 */
public class DBConnProvider {
	
	private static ComboPooledDataSource cpds=new ComboPooledDataSource();
	
	/**
	 * 返回一个数据库连接
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return cpds.getConnection();
	}

}
