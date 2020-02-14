<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
<script type="text/javascript">

	$(function(){
		$('form>div>input').attr('type','hidden');
		$('form button').hide();
		$('form').next().click(function(){
			$('form>div>input').attr('type','text');
			$('form span').hide();
	  		$('form button').show();
	  		$('form+button').hide();
		});
	});

</script>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1>detail page</h1>
	<form action="update" method="post">
		<div>
			<label for="sabun">sabun</label>
			<input type="text" name="sabun" id="sabun" value="${bean.sabun }"/>
			<span>${bean.sabun }</span>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name" value="${bean.name }"/>
			<span>${bean.name }</span>
		</div>
		<div>
			<label for="nalja">nalja</label>
			<input type="text" name="nalja" id="nalja" value="${bean.nalja }"/>
			<span>${bean.nalja }</span>
		</div>
		<div>
			<label for="pay">pay</label>
			<input type="text" name="pay" id="pay" value="${bean.pay }"/>
			<span>${bean.pay }</span>
		</div>
		<div>
			<button>수정</button>
		</div>
	</form>
	<button>수정</button>
</body>
</html>