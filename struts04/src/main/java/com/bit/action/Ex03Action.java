package com.bit.action;

import com.opensymphony.xwork2.ActionSupport;

public class Ex03Action extends ActionSupport{

	String id,pw;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("execute...");
		if(this.hasErrors())return this.INPUT;
		return this.SUCCESS;
	}
	
	@Override
	public void validate() {
		if(pw.isEmpty())addFieldError("pw", "password err");
	}
}
