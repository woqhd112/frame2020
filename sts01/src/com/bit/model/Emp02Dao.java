package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.model.entity.Emp02Vo;


public class Emp02Dao {

	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
//	public Emp02Dao() throws SQLException {
//		
//		System.out.println("create dao...");
////		OracleDataSource dataSource=new OracleDataSource();
////		dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
////		dataSource.setUser("scott");
////		dataSource.setPassword("tiger");
//		
////		this.dataSource=dataSource;
//	}
	
	public List<Emp02Vo> selectAll() throws SQLException{
		
		String sql="select * from emp02";
		List<Emp02Vo> list=new ArrayList<>();
		
		try(Connection conn=dataSource.getConnection()) {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Emp02Vo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay")));
			}
		}
		return list;
	}
	
	
	public Emp02Vo selectOne(int sabun) throws SQLException {
		
		String sql="select * from emp02 where sabun=?";
		Emp02Vo bean=null;
		
		try(Connection conn=dataSource.getConnection();PreparedStatement pstmt=conn.prepareStatement(sql);){
			pstmt.setInt(1, sabun);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				bean=new Emp02Vo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay"));
			}
		}
		
		return bean;
	}
	
	public void insertOne(int sabun, String name, int pay) throws SQLException {
		
		String sql="insert into emp02 values (?,?,sysdate,?)";
		
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay);
			pstmt.executeUpdate();
		}
	}
	
	
	public int updateOne(int sabun, String name, int pay) throws SQLException {
		
		String sql="update emp02 set name=?,pay=? where sabun=?";
		
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, sabun);
			return pstmt.executeUpdate();
		}
	}
	
	public int deleteOne(int sabun) throws SQLException {
		
		String sql="delete from emp02 where sabun=?";
		
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			
			return pstmt.executeUpdate();
		}
	}
}
