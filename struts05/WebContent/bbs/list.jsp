<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="index.jsp">
	        <div>비트교육센터</div>
	      </a>
	    </div><!-- end navbar-header -->
		    <p class="navbar-text navbar-right">
			    <a href="home.bit" class="navbar-link">[HOME]</a>
			    <a href="intro.bit" class="navbar-link">[INTRO]</a>
			    <a href="bbs/list.bit" class="navbar-link">[B B S]</a>
			    <a href="#" class="navbar-link">[LOGIN]</a>
		    </p>
	  </div><!-- end contriner-fluid -->
	</nav>
	<div class="jumbotron">
	  <h1>LIST PAGE!</h1>
	</div>
	
	<div class="container">
		<div class="row">
		  <div class="col-xs-12 col-md-12">
		 	<div class="page-header">
			  <h2>LIST <small>emp02 content</small></h2>
	 		  <a href="add.bit" class="btn btn-default" role="button">입력</a>
			</div>
		  	<table class="table table-hover">
		  		<thead>
		  		<tr>
		  			<th>사번</th>
		  			<th>이름</th>
		  			<th>날짜</th>
		  			<th>금액</th>
		  		</tr>
		  		</thead>
		  		<tbody>
		  		<c:forEach items="${list }" var="bean">
		  			<tr>
		  				<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.sabun }</a></td>
		  				<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.name }</a></td>
		  				<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.nalja }</a></td>
		  				<td><a href="detail.bit?bean.sabun=${bean.sabun }">${bean.pay }</a></td>
		  			</tr>
		  		</c:forEach>
		  		</tbody>
		  	</table>
		  </div>
		</div>
	</div>
</body>
</html>