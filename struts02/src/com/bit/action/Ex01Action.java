package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action{

	@Override
	public String execute() throws Exception {
		
//		  public static final java.lang.String SUCCESS = "success";
//		  public static final java.lang.String NONE = "none";
//		  public static final java.lang.String ERROR = "error";
//		  public static final java.lang.String INPUT = "input";	���� �Ķ���ͳѱ涧 ����
//		  public static final java.lang.String LOGIN = "login";	�α��� �ƴҶ� �α���ȭ������ ����
		  
//		return "success";
//		return "error";
		return this.SUCCESS;
	}

}
