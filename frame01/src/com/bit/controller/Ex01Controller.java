package com.bit.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ex01.bit")
public class Ex01Controller extends HttpServlet{
	Logger log=Logger.getLogger("com.bit.controller.Ex01Controller");//클래스의정보를 인자로 넣어서 객체를 생성함
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("ex01.jsp").forward(req, resp);
	}
}
