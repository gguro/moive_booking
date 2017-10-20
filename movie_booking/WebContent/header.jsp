<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %>  


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Movie Booking</title>
	<link rel="stylesheet" href="/movie_booking/css/style.css" >
	<link rel="stylesheet" href="/movie_booking/css/style2.css" >
	<script type="text/javascript" src="/movie_booking/script/member.js"></script>
	
</head>
<body>
<div>
	홈으로 >> 
	<a href="MemberFC?command=index">홈</a> 
	<c:if test="${loginUser.usergroup == 'admin'}">${loginUser.userid} 관리자님</c:if>
	<c:if test="${loginUser.usergroup == 'user'}">${loginUser.userid} 회원님</c:if> 
	<br>
	<hr>
</div>

