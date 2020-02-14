package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action{

	@Override
	public String execute() throws Exception {
		
//		  public static final java.lang.String SUCCESS = "success";
//		  public static final java.lang.String NONE = "none";
//		  public static final java.lang.String ERROR = "error";
//		  public static final java.lang.String INPUT = "input";	빈값을 파라미터넘길때 에러
//		  public static final java.lang.String LOGIN = "login";	로그인 아닐때 로그인화면으로 리턴
		  
//		return "success";
//		return "error";
		return this.SUCCESS;
	}

}
