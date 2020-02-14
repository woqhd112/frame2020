<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1~div{}
	h1~div>span{
		display: inline-block;
		width: 100px;
	}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
	<h1>list page</h1>
	<a href="add">입력</a>
		<div>
			<span>사번</span>
			<span>이름</span>
			<span>날짜</span>
			<span>금액</span>
		</div>
	<c:forEach items="${alist }" var="bean">
		<div>
		<a href="detail?sabun=${bean.sabun }">
			<span>${bean.sabun }</span>
			<span>${bean.name }</span>
			<span>${bean.nalja }</span>
			<span>${bean.pay }</span>
		</a>
		</div>
	</c:forEach>
</body>
</html>