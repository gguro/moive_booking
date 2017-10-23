<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<h2>상영 리스트</h2>
<table class="list">
	<tr>
		<th>상영 번호</th>
		<th>영화 코드</th>
		<th>상영관 코드</th>
		<th>극장</th>
		<th>상영관</th>
		<th>상영회차</th>
		<th>상태</th>
	</tr>
	<c:forEach var="showviewlist" items="${showviewlist}">
		<tr class="record">
			<td>${showviewlist.sh_code}</td>
			<td>${showviewlist.mv_code}</td>
			<td>${showviewlist.sr_code}</td>
			<td>${showviewlist.th_name}</td>
			<td>${showviewlist.sr_name}</td>
			<td>${showviewlist.showtime}</td>
			<td>${showviewlist.sh_status}</td>
		</tr>
	</c:forEach>
</table>



<%@ include file="../footer.jsp" %>