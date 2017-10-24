<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %>  

<!doctype html>
<html lang="ko">
	<head>
		<title>Hello, world!</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script type="text/javascript" src="/movie_booking/script/member.js"></script>
	</head>
	<body>

<nav class="navbar navbar-expand-md navbar-dark bg-dark" style="margin-bottom: 50px;">
  <a class="navbar-brand" href="#">AAA</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExample04">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="MemberFC?command=index">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
      <li class="nav-item dropdown">
		
        <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<c:if test="${loginUser.name != null}">
				내정보
			</c:if>
			<c:if test="${loginUser.name == null}">
				접속하기
			</c:if>
		</a>
        <div class="dropdown-menu" aria-labelledby="dropdown04">
	        <c:if test="${loginUser.name != null}">
		        <a class="dropdown-item" href="MemberFC?command=myinfo">${loginUser.name}님</a>
		        <a class="dropdown-item" href="MemberFC?command=logout">로그아웃</a>
			</c:if>
			<c:if test="${loginUser.name == null}">
		        <a class="dropdown-item" href="MemberFC?command=login_form">로그인</a>
		        <a class="dropdown-item" href="MemberFC?command=join_form">회원가입</a>
			</c:if>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-md-0">
      <input class="form-control" type="text" placeholder="Search">
    </form>
  </div>
</nav>

<%
	String userId = null;
	if(session.getAttribute("userId") != null){
		userId = (String)session.getAttribute("userId");
	}
%>

