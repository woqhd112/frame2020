package com.bit.action;

import com.bit.model.Emp02Dao;
import com.opensymphony.xwork2.Action;

public class InsertAction implements Action{

	private int sabun;
	private String name;
	private int pay;
	private String errMsg;
	
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getErrMsg() {
		return errMsg;
	}

	@Override
	public String execute() throws Exception {
		
		if(sabun==0){
			errMsg="<div class=\"alert alert-danger\" role=\"alert\">����� Ȯ���ϼ��� <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button></div>";
			return this.INPUT;
		}else if(name.isEmpty()){
			errMsg="<div class=\"alert alert-danger\" role=\"alert\">�̸��� Ȯ���ϼ��� <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button></div>";
			return this.INPUT;
		}
		
		Emp02Dao dao=new Emp02Dao();
		dao.insertOne(sabun,name,pay);
		
		return this.SUCCESS;
	}

}
