<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>  


<div id="wrapper">
	<h2> 영화 예매 사이트 홈페이지 </h2>
	<br>
	<c:if test="${loginUser.name != null}">
		<a>${loginUser.name}님.</a>
		<a href="MemberFC?command=logout">logout</a>
	</c:if>
	영화 예매 서비스
	<c:if test="${loginUser.name == null}">
	<a href="MemberFC?command=login_form">로그인</a> 
	</c:if>
</div> 


<%@ include file="footer.jsp" %>