package com.intyt.dbpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * 自己实现的连接池类
 * 
 * @author twy
 * 
 */
public class MyDBConnPool {

	// 配置文件
	public static ResourceBundle rb = ResourceBundle.getBundle("mypool");

	private Connection con = null;
	private static int inUsed = 0; // 使用的连接数
	private static ArrayList<Connection> freeConnections = new ArrayList<Connection>();// 容器，空闲连接
	private static String driver; // 驱动
	private static String url; // 数据库连接地址
	private static String user; // 用户名
	private static String password; // 密码
	private static int minConn; // 最小连接数
	private static int maxConn; // 最大连接

	static {
		driver = rb.getString("driver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		url = rb.getString("url");
		user = rb.getString("user");
		password = rb.getString("password");
		minConn = Integer.parseInt(rb.getString("minConn"));
		maxConn = Integer.parseInt(rb.getString("maxConn"));
	}
	
	//初始化连接池，向连接池中放入最小连接数的连接
	public static void initPool(){
		for (int i = 0; i < minConn; i++) {
			Connection conn=null;
			try {
				conn = DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			freeConnections.add(conn);
		}
	}
	
	public synchronized static Connection getConn() {
		Connection con = null;
		if (freeConnections.size() > 0) {
			con = (Connection) freeConnections.get(0);
			freeConnections.remove(0);// 如果连接分配出去了，就从空闲连接里删除
			inUsed++;
		} 
		return con;
	}
	
	//释放连接
	public static void releaseConn(Connection conn){
		if(conn!=null&&(inUsed+freeConnections.size())<maxConn){
			freeConnections.add(conn);
		}
		inUsed--;
	}

	public static void main(String[] args) {
		MyDBConnPool.initPool();
		long start=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			Connection conn=MyDBConnPool.getConn();
			if(conn!=null){
				System.out.println(i+"----");
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
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					MyDBConnPool.releaseConn(conn);
				}
			}
			System.out.println("inUsed:"+MyDBConnPool.inUsed+"  空闲："+MyDBConnPool.freeConnections.size());
		}
		long end=System.currentTimeMillis();
		System.out.println("耗时："+(end-start)+"ms");
	}

}
