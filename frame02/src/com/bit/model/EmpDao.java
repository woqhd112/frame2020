package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.core.JdbcTemplate1;
import com.bit.model.entuty.EmpVo;

public class EmpDao {
	
	private Connection getConnection() throws SQLException {
		String driver="org.mariadb.jdbc.Driver";
		String url="jdbc:mysql:replication://localhost:3306/test";	//뒤에 test는 생성한 db명
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(url,user,password);
		
		return conn;
	}
	
	
	private void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}

	public ArrayList<EmpVo> selectAll() throws SQLException {
		ArrayList<EmpVo> list=new ArrayList<EmpVo>();
		String sql="select * from emp";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpVo bean=new EmpVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				
				list.add(bean);
			}
		}finally {
			close(rs,pstmt,conn);
		}
		return list;
		
	}

	public EmpVo selectOne(int sabun) throws SQLException {
		
		String sql="select * from emp where sabun=?";
		
		EmpVo bean=new EmpVo();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sabun);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
			}
		}finally {
			close(rs,pstmt,conn);
		}
		
		return bean;
	}
	
	
	
	
	public void insertOne(String name, int pay) throws SQLException {
		
		String sql="insert into emp (name,nalja,pay) values (?,now(),?)";
		
		JdbcTemplate1 template=new JdbcTemplate1();
		template.setConnection(getConnection());
		
		Object[] objs= {name,pay};
		
		template.executeUpdate(sql,objs);
		
	}
	
	

	public int updateOne(int sabun, String name, int pay) throws SQLException {
		
		String sql="update emp set name=?,pay=? where sabun=?";
		
		JdbcTemplate1 template=new JdbcTemplate1();
		template.setConnection(getConnection());
		
		Object[] objs= {name,pay,sabun};
		
		int result=template.executeUpdate(sql,objs);
		
		return result;
	}
}
