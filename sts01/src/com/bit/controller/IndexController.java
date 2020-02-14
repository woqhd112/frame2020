package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index"); //디스패쳐에서 스트링 리턴하는곳을 여기서 설정 -뎁스가 들어가면 여기에 설정해주면됨
		
		return mav;
	}

}
