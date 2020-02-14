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
		return this.getJdbcTemplate().query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Emp02Vo(rs.getInt("sabun"),rs.getString("name"),rs.getDate("nalja"),rs.getInt("pay"));
			}});
	}
}
