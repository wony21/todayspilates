<%@page import="m.todays.pilates.security.CustomUserDetails"%>
<%@page import="m.todays.pilates.domain.user.User"%>
<%@page import="m.todays.pilates.common.SessionUtils"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@ page session="false"%>


<tg:base>
	<jsp:body>
		<div class="container" style="margin-top: 5%;">
		<div class="row">
			<div class="col-1"></div>
			<div class="col">
				<span class="badge badge-secondary">관리자( ${userLv} ) : ${username} 님 반갑습니다!</span>
				<br />
				<form name="form" method="POST" action="/logout">
					<button type="submit" class="btn btn-primary btn-sm">로그아웃</button>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col"></div>
			<div class="col"></div>
			<div class="col"></div>
		</div>
		</div>
	</jsp:body>
</tg:base>