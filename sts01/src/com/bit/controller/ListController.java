package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.entity.Emp02Vo;

public class ListController implements Controller {
	Emp02Dao dao;
	
	public void setDao(Emp02Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav=new ModelAndView();
		List<Emp02Vo> list=dao.selectAll();
		
		mav.addObject("alist",list);
		//request.setAttribute("alist", list);
		mav.setViewName("list");
		
		return mav;
	}

}
