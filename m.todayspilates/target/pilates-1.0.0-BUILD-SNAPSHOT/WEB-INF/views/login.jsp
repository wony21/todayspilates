<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>로그인페이지</title>  
</head>
  
<body>
<h2>로그인 </h2>
<form name="form" method="post" action="loginProcess">
<table>
    <tr height="40px">
        <td>사용자아이디</td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr height="40px">
        <td>패스워드</td>
        <td><input type="password" name="pw"></td>
    </tr>
</table>
<table>
    <tr>
        <td align="center"><input type="submit" value="로그인"></td>
        <td align="center"><input type="reset" value="리셋"></td>
    </tr>
</table>
</form>
</body>
</html>


출처: http://goodcodes.tistory.com/entry/Spring-01-스프링-시큐리티로그인-사용자-인증 [Good Codes Make a Good Program]