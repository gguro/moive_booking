<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h1>회원 목록 - 관리자 페이지</h1>
<table class="list">
	<tr>
		<th>이름</th>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이메일</th>
		<th>연락처</th>
		<th>등급</th>
		<th>회원 탈퇴</th>
	</tr>
	<c:forEach var="list" items="${memberList}">
		<tr class="record">
			<td>${list.name}</td>
			<td>${list.userid}</td>
			<td>${list.pwd}</td>
			<td>${list.email}</td>
			<td>${list.phone}</td>
			<td>${list.usergroup}</td>
			<td>
				<a href="#">탈퇴</a>
			</td>
		</tr>
	</c:forEach>
</table>
<%@ include file="../footer.jsp"%>