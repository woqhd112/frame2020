package com.bit.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate1 {
	Connection conn;
	
	public void setConnection(Connection conn){
		this.conn=conn;
	}

	public int executeUpdate(String sql,Object[] objs) throws SQLException {
		
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++) {
				pstmt.setObject(i+1, objs[i]);
			}
			return pstmt.executeUpdate();
		}finally {
			close(null,pstmt,conn);
		}
		
	}
	
	private void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
}
