package com.bit.model;

import java.sql.SQLException;
import java.util.List;


public interface Dept01Dao<T> {

	List<T> selectAll() throws SQLException;
	void insertOne(T bean) throws SQLException;
	int deleteOne(int sequence_num) throws SQLException;
}
