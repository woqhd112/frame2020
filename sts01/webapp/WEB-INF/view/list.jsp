<%@page import="com.bit.model.entity.Emp02Vo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="index.bit">HOME</a>
		<a href="list.bit">B B S</a>
		<a href="login.bit">LOGIN</a>
	</nav>
	<h1>리스트 페이지</h1>
	<a href="add.bit">입 력</a>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<%
			List<Emp02Vo> list=(List<Emp02Vo>)request.getAttribute("alist");
			for(Emp02Vo bean:list){
		%>
		<tr>
			<td><a href="detail.bit?sabun=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
			<td><a href="detail.bit?sabun=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
			<td><a href="detail.bit?sabun=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
			<td><a href="detail.bit?sabun=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
		</tr>
		<%} %>
	</table>
</body>
</html>