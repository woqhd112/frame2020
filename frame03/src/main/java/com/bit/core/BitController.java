package com.bit.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BitController {

	
	String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
