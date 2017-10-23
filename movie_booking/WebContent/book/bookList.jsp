<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div id="wraper">

<h2> 예약리스트 </h2>
<table class="list">
	<tr>
		<th>예약번호</th>
		<th>아이디</th>
		<th>좌석코드</th>
		<th>예약일</th>
		<th>상태</th>
	</tr>
	<c:forEach var="booklist" items="${booklist}">
		<tr class="record">
			<td>${booklist.bk_code}</td>
			<td>${booklist.userid}</td>
			<td>${booklist.st_code}</td>
			<td>${booklist.bk_date}</td>
			<td>${booklist.bk_status}</td>
		</tr>
	</c:forEach>
</table>
</div>
<%@ include file="../footer.jsp" %>