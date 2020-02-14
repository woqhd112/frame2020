package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;

public class UpdateController implements Controller {

	Emp02Dao dao;
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		ModelAndView mav=new ModelAndView();
		int sabun=Integer.parseInt(request.getParameter("sabun"));
		String name=request.getParameter("name");
		int pay=Integer.parseInt(request.getParameter("pay"));
		
		dao.updateOne(sabun,name,pay);
		mav.setViewName("redirect:/detail.bit?sabun="+sabun);
		
		return mav;
	}

}
