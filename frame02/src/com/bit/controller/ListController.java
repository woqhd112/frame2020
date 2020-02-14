package com.bit.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.EmpDao;

public class ListController implements BitController{

	public String execute(HttpServletRequest req) {
		EmpDao dao=new EmpDao();
		try {
			req.setAttribute("alist", dao.selectAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}
}
