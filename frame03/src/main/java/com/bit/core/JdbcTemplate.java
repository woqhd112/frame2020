package com.bit.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class JdbcTemplate {
	DataSource dataSource;

	public Connection getConnection() throws SQLException{
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/xe"
				, "scott", "tiger");
		return conn;
	}

	public Object executeOne(String sql,RowMapper mapper,Object[] objs) throws SQLException{
		return execute(sql,mapper,objs).get(0);
	}
	
	public List execute(String sql,RowMapper mapper) throws SQLException{
		return execute(sql,mapper, new Object[]{});
	}
	
	public List execute(String sql,RowMapper mapper,Object[] objs) throws SQLException{
		List list=new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++){
				pstmt.setObject(i+1,objs[i]);
			}
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(mapper.rows(rs));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return list;
	}
	public int executeUpdate(String sql,Object[] objs) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++){
				pstmt.setObject(i+1,objs[i]);
			}
			return pstmt.executeUpdate();
		}finally {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}

}