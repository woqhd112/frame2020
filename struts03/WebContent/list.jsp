<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
	<div class="btn-group btn-group-justified" role="group" aria-label="...">
		<a href="./index.action" class="btn btn-default btn-lg btn-block" role="button">HOME</a>
		<a href="./intro.action" class="btn btn-default btn-lg btn-block" role="button">INTRO</a>
		<a href="./list.action" class="btn btn-primary btn-lg btn-block" role="button">B B S</a>
		<a href="./login.action" class="btn btn-default btn-lg btn-block" role="button">LOGIN</a>
	</div>
	<div class="container">
		<div class="row">
		  <div class="col-sm-12">
		  	<div class="jumbotron">
			  <h1>ADD PAGE</h1>
			  <a href="add.action" class="btn btn-default" role="button">입력</a>
			</div>
		  </div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<table class="table">
					<tr>
						<th>사번</th>
						<th>이름</th>
						<th>날짜</th>
						<th>금액</th>
					</tr>
					<c:forEach items="${list }" var="bean">
						<tr>
							<td>${bean.sabun }</td>
							<td>${bean.name }</td>
							<td>${bean.nalja }</td>
							<td>${bean.pay }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>