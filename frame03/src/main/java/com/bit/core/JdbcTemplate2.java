package com.bit.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.model.entity.EmpVo;

public abstract class JdbcTemplate2 {
	
	DataSource dataSource;

	public Connection getConnection() throws SQLException{
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xe","scott","tiger");
		
		return conn;
	}
	
	
	public Object executeOne(String sql) throws SQLException{
		
		return execute(sql).get(0);
	}
	
	public List execute(String sql) throws SQLException{
		
		List list=new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(mapper(rs));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		
		return list;
	}
	
	
	public abstract void setStatement(PreparedStatement pstmt);
	public abstract EmpVo mapper(ResultSet rs) throws SQLException;
}
