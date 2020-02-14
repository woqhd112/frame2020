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
	<h1>리스트 페이지</h1>
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
			<td><%=bean.getSabun() %></td>
			<td><%=bean.getName() %></td>
			<td><%=bean.getNalja() %></td>
			<td><%=bean.getPay() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>