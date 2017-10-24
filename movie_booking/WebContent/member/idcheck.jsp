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
	
<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>아이디 중복 확인</h3>
				<form method="post" action="MemberFC?command=id_check_form" name="frm">
				  <div class="form-group row" >
				    <label for="userid" class="col-sm-4 col-form-label">아이디</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="userid" placeholder="아이디" name="userid"  value="${userid}">
				    </div>
				  </div>
				    <c:if test="${result == 1}">
						${userid}는 이미 사용중입니다.
					</c:if>
					<c:if test="${result == -1}">
						${userid}는 사용 가능한 아이디입니다.
						<button class="btn btn-outline-primary" type="button" onclick="idok()">사용</button>
					</c:if>
				    
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>


		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</body>
</html>
