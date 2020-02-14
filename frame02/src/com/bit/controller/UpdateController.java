package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.EmpDao;

public class UpdateController implements BitController{

	@Override
	public String execute(HttpServletRequest req) {
		
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		
		EmpDao dao=new EmpDao();
		int result=0;
		try {
			result=dao.updateOne(sabun,name,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "redirect:list";
	}

}
