package com.intyt.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 增、删、改、查操作
 * @author twy
 *
 */
public class CRUD {
	
	//查
	public static void rDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql="select * from person where age>?";
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, 18);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("name")+" "+rs.getInt("age"));
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
	
	//增
	public static void cDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql="insert into person(name,age) values(?,?)";
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, "小明");
			stmt.setInt(2, 10);
			stmt.execute();
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
	
	//改
	public static void uDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql="update person set age=? where id=?";
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,30 );
			stmt.setInt(2, 1);
			stmt.executeUpdate();
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
	
	//批量改
	public static void uBatchDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql="update person set age=? where id=?";
			stmt=conn.prepareStatement(sql);
			for(int i=1;i<3;i++){
				stmt.setInt(1,i+20 );
				stmt.setInt(2, i);
				stmt.addBatch();
			}
			stmt.executeBatch();
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
	
	//删
	public static void dDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql="delete from person where id=?";
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,2);
			stmt.execute();
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
	
	//事务
	public static void transactionDemo(){
		DBUtil dbUtil=new DBUtil();
		Connection conn = dbUtil.getConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		PreparedStatement stmt=null;
		try {
			conn.createStatement();
			String sql1="delete from person where age>?";
			stmt=conn.prepareStatement(sql1);
			stmt.setInt(1,20);
			stmt.execute();
			String sql2="insert into person(name,age) values(?,?)";
			stmt=conn.prepareStatement(sql2);
			stmt.setString(1,"小乐");
			stmt.setInt(2,18);
			stmt.execute();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				//事务回滚
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
	
	public static void main(String[] args) {
		uBatchDemo();
	}

}
