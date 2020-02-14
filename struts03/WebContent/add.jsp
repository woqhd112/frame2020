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

	${errMsg }
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
			  <h1>LIST PAGE</h1>
			</div>
		  </div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<form action="insert.action">
					<div class="form-group">
					    <label for="sabun">사번</label>
					    <input type="text" class="form-control" id="sabun" name="sabun" placeholder="사번" value="${param.sabun }">
				  	</div>
					<div class="form-group">
					    <label for="name">이름</label>
					    <input type="text" class="form-control" id="name" name="name" placeholder="이름" value="${param.name }">
				  	</div>
					<div class="form-group">
					    <label for="pay">금액</label>
					    <input type="text" class="form-control" id="pay" name="pay" placeholder="금액" value="${param.pay }">
				  	</div>
				  <button type="submit" class="btn btn-default">입력</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>