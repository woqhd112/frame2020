package com.bit.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServlet extends HttpServlet{

	Map<String,String> map=new HashMap<String,String>();
	
	@Override
	public void init(ServletConfig config) throws ServletException {	//서블릿 최초실행시 init이 실행하기때문에 init에 맵핑할 주소를 입력
		map.put("/","com.bit.controller.IndexController");
		map.put("/intro","com.bit.controller.IntroController");
		map.put("/bbs/list","com.bit.controller.ListController");
		map.put("/bbs/add","com.bit.controller.AddController");
		map.put("/bbs/insert","com.bit.controller.InsertController");
		map.put("/bbs/detail","com.bit.controller.DetailController");
		map.put("/bbs/update","com.bit.controller.UpdateController");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doBit(req,resp);	// doget으로 접근시 바로 dobit를 실행
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");	//포스트방식은 한글처리해야하니 넘어온 req를 전부 한글처리하고 dobit실행
		doBit(req,resp);
		
	}
	
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String url=req.getRequestURI();	//현재 입력된 url주소값
		
		url=url.substring(req.getContextPath().length());	//주소값에서 앞에 프로젝트명을 짜름
		
		BitController controller=null;
		String info=map.get(url);	//짜른 url주소값으로 맵에있는 value값을 꺼내와 info에 저장
		
		try {
			Class<?> clzz=Class.forName(info);	//해당 info로 클래스연결함
			controller=(BitController)clzz.newInstance();	//연결한 클래스클래스로 객체생성
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		String viewName=controller.execute(req);	//해당 맵핑값을 맵의 밸류값으로 저장한 controller로 메소드호출해서 forward할 스트링값을 리턴
		
		if(viewName.startsWith("redirect:")) {	//조건문 redirect 할부분은 redirect 시켜줌
			resp.sendRedirect(viewName.substring(9));	//뽑아낸 리턴 스트링값에서 redirect: 를 짜르고 실행
		}else {		//아닐경우는 forward
			String prifix="/WEB-INF/view/";	//중복되는값은 prifix,suffix로 구분해서 짜름
			String suffix=".jsp";
			viewName=prifix+viewName+suffix;
			RequestDispatcher rd=req.getRequestDispatcher(viewName);	//forwad하는부분
			rd.forward(req, resp);
		}
	}
}
