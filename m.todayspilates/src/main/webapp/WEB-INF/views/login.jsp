<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>LOGIN</title>  
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" >
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>

<body style="background-color: skyblue;">
	
	 <div class="container" style="margin-top: 5%;">
	 	<h2>사용자로그인</h2>
		<form name="form" method="post" action="loginProcess">
		  <div class="form-group">
		    <label for="userId">사용자아이디</label>
		    <input type="text" class="form-control" name="id" id="id" aria-describedby="emailHelp" placeholder="아이디를 입력하세요.">
		  </div>
		  <div class="form-group">
		    <label for="userPs">비밀번호</label>
		    <input type="password" class="form-control" name="pw" id="pw" placeholder="비밀번호를 입력하세요.">
		  </div>
		  <button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>
</body>
</html>
