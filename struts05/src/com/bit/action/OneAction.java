package com.bit.action;

import com.bit.model.Emp02Dao;
import com.bit.model.entity.Emp02Vo;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action {
	
	private Emp02Vo bean=new Emp02Vo();
	
	public Emp02Vo getBean() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		
		Emp02Dao dao=new Emp02Dao();
		bean=dao.selectOne(bean.getSabun());
		
		return this.SUCCESS;
	}

}
