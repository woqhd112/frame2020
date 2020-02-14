package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;

public class DeleteController implements Controller {

	Emp02Dao dao;
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav=new ModelAndView();
		
		dao.deleteOne(Integer.parseInt(request.getParameter("sabun")));
		mav.setViewName("redirect:/list.bit");
		
		return mav;
	}

}
