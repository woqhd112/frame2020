package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.EmpDao;

public class InsertController implements BitController{

	public String execute(HttpServletRequest req) {
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		EmpDao dao=new EmpDao();
		try {
			dao.insertOne(name,pay);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "redirect:list";
	}
}
