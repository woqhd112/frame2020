package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.EmpDao;

public class DetailController implements BitController{

	@Override
	public String execute(HttpServletRequest req) {
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		EmpDao dao=new EmpDao();
		try {
			req.setAttribute("bean", dao.selectOne(sabun));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "detail";
	}

}
