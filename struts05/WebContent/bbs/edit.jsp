<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
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
	  <h1>EDIT PAGE!</h1>
	</div>
	
	<div class="container">
		<div class="row">
		  <div class="col-xs-12 col-md-12">
		 	<div class="page-header">
			  <h2>EDIT <small>edit emp02</small></h2>
			</div>
			<!-- start form  -->
			<form class="form-horizontal" action="update.bit" method="post">
			  <div class="col-sm-offset-2 col-sm-10">${fieldErrors["bean.sabun"] }</div>
			  <div class="form-group">
			    <label for="sabun" class="col-sm-2 control-label">사번</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="sabun" name="sabun" placeholder="사번" value="${bean.sabun }" readonly="readonly">
			    </div>
			  </div>
			  <div class="col-sm-offset-2 col-sm-10">${fieldErrors["bean.name"] }</div>
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">이름</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" name="name" placeholder="이름" value="${bean.name }">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="nalja" class="col-sm-2 control-label">날짜</label>
			    <div class="col-sm-10">
			    	${bean.nalja }
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="pay" class="col-sm-2 control-label">금액</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="pay" name="pay" placeholder="금액" value="${bean.pay }">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary">수정</button>
			      <button type="reset" class="btn btn-default">취소</button>
			    </div>
			  </div>
			</form>
			<!-- end form -->
		  </div>
		</div>
	</div>
</body>
</html>