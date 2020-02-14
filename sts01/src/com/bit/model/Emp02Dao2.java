package com.bit.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.model.entity.Emp02Vo;

public class Emp02Dao2 extends JdbcDaoSupport{

	public List<Emp02Vo> selectAll(){
		
		String sql="select * from emp02 order by sabun desc";
		return this.getJdbcTemplate().query(sql, new RowMapper<Emp02Vo>() {

			@Override
			public Emp02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Emp02Vo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay"));
			}});
	}
	
	public Emp02Vo selectOne(int sabun) {
		
		String sql="select * from emp02 where sabun=?";
		
		return this.getJdbcTemplate().queryForObject(sql, new RowMapper<Emp02Vo>() {

			@Override
			public Emp02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Emp02Vo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay"));
			}
		},new Object[] {sabun});
	}
	
	
	public void insertOne(int sabun, String name, int pay) {
		
		String sql="insert into emp02 values (?,?,sysdate,?)";
		
		this.getJdbcTemplate().update(sql,new Object[] {sabun,name,pay});
	}
	
	
	public int updateOne(int sabun, String name, int pay) {
		
		String sql="update emp02 set name=?,pay=? where sabun=?";
		
		return this.getJdbcTemplate().update(sql,new Object[] {name,pay,sabun});
	}
	
	
	public int deleteOne(int sabun) {
		
		String sql="delete from emp02 where sabun=?";
		
		return this.getJdbcTemplate().update(sql,new Object[] {sabun});
	}
}
