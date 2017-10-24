<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-0"></div>
		<div class="jumbotron col-md-12">
		<h2 class="text-center">상영정보</h2>
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">상영코드</th>
			      <th scope="col">영화코드</th>
			      <th scope="col">극장</th>
			      <th scope="col">상영관</th>
			      <th scope="col">회차</th>
			      <th scope="col">상영상태</th>
			    </tr>
			  </thead>
			  <tbody>
				<c:forEach var="showviewlist" items="${showviewlist}">
				    <tr>
				        <th scope="row">${showviewlist.sh_code}</th>
						<td>${showviewlist.mv_code}</td>
					    <td>${showviewlist.th_name}</td>
						<td>${showviewlist.sr_name}</td>
						<td>${showviewlist.showtime}</td>
						<td>${showviewlist.sh_status}</td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="col-md-0"></div>
	</div>
</div>

<%@ include file="../footer.jsp" %>