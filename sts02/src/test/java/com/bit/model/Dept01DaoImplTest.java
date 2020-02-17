package com.bit.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.model.entity.Dept01Vo;

public class Dept01DaoImplTest {

	@Test
	public void testSetDataSource() {
	}

	@Test
	public void testSelectAll() throws SQLException {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao<Dept01Vo> dao=(Dept01Dao<Dept01Vo>) context.getBean("dept01Dao2");
		List<Dept01Vo> list=dao.selectAll();
		assertNotNull(list);
		for(Dept01Vo bean:list)System.out.println(bean);
	}

	@Test
	public void testInsertOne() throws SQLException {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao<Dept01Vo> dao=(Dept01Dao<Dept01Vo>) context.getBean("dept01Dao2");
		Dept01Vo bean=new Dept01Vo(0,"test","test");
		dao.insertOne(bean);
	}

	@Test
	public void testDeleteOne() throws SQLException {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Dept01Dao<Dept01Vo> dao=(Dept01Dao<Dept01Vo>) context.getBean("dept01Dao2");
		assertSame(1, dao.deleteOne(7));
	}

}
