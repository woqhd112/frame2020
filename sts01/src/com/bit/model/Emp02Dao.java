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
}
