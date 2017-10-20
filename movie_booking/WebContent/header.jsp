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
	<script type="text/javascript" src="/movie_booking/script/member.js"></script>
	
</head>
<body>
<div>
	홈으로 >> 
	<a href="MemberFC?command=index">홈</a> 
	<br>
	회원 관련 페이지 >> 
	<a href="MemberFC?command=login_form">로그인폼</a> | 
	<a href="MemberFC?command=logout">로그아웃</a> |
	<a href="MemberFC?command=join_form">회원가입폼</a> |
	<a href="MemberFC?command=myinfo">내정보</a> | 
	<a href="MemberFC?command=find_form">아이디/암호 찾기</a> |
	<a href="MemberFC?command=find_id_check_form">아이디중복검사</a> |
	
	<br>
	관리자 관련 페이지 >>
	<a href="#">관리자 홈</a> |
	<a href="#">회원리스트</a> |
	<br>
	영화 관련 페이지>>
	<a href="MovieFC?command=movieList">영화리스트</a> |
	<a href="MovieFC?command=movieWriteForm">영화등록</a> |
	<br>
	상영 관련 페이지>>
	<a href="ShowFC?command=getshowlist">상영리스트</a> |
	<a href="ShowFC?command=getshowupdateform">상영등록</a>
	<br>
	티겟 관련 페이지>>
	<a href="#">티켓리스트</a> |
	<a href="#">티켓등록</a>
	<br>
	예약 관련 페이지>>
	<a href="#">예약리스트</a> |
	<a href="#">예약등록</a>
	<br>
	<hr>
</div>

