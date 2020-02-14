package com.bit;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class BbsAction implements ModelDriven<Emp02Vo>,Preparable{
	
	private List<Emp02Vo> list;
	private Emp02Vo bean;
	
	
//	public void setBean(Emp02Vo bean) {
//	System.out.println("실행4");
//		this.bean = bean;
//	}
	
	public List<Emp02Vo> getList() {
		return list;
	}
	
	
	public Emp02Vo getBean() {
		return bean;
	}
	
	
	public String execute(){
		
		return Action.SUCCESS;
	}
	
	public String list() throws SQLException{
		System.out.println("실행3");
		
		Emp02Dao dao=new Emp02Dao();
		list=dao.selectAll();
		
		return Action.SUCCESS;
	}
	
	public String insert() throws SQLException{
		
		Emp02Dao dao=new Emp02Dao();
		dao.insertOne(bean);
		
		return Action.SUCCESS;
	}

	public String detail() throws SQLException{
		
		Emp02Dao dao=new Emp02Dao();
		bean=dao.selectOne(bean.getSabun());
		System.out.println("실행3");
		
		return Action.SUCCESS;
	}
	
	
	public String update() throws SQLException{
		
		Emp02Dao dao=new Emp02Dao();
		dao.updateOne(bean);
		
		return Action.SUCCESS;
	}
	
	public String delete() throws SQLException{
		
		Emp02Dao dao=new Emp02Dao();
		dao.deleteOne(bean.getSabun());
		return Action.SUCCESS;
	}
	
	@Override
	public void prepare() throws Exception {
		
		System.out.println("실행1");
		bean=new Emp02Vo();
	}

	@Override
	public Emp02Vo getModel() {
		
		System.out.println("실행2");
		return bean;
	}
}
