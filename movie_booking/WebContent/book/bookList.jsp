<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>


<div class="container">
	<div class="row">
		<div class="col-md-0"></div>
		<div class="jumbotron col-md-12">
		<h2 class="text-center">예약 목록</h2>
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">예약번호</th>
			      <th scope="col">아이디</th>
			      <th scope="col">좌석코드</th>
			      <th scope="col">예약일</th>
			      <th scope="col">상태</th>
			    </tr>
			  </thead>
			  <tbody>
				<c:forEach var="showviewlist" items="${booklist}">
				    <tr>
				        <th scope="row">${showviewlist.bk_code}</th>
					    <td>${showviewlist.userid}</td>
						<td>${showviewlist.st_code}</td>
						<td>${showviewlist.bk_date}</td>
						<td>${showviewlist.bk_status}</td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="col-md-0"></div>
	</div>
</div>

<%@ include file="../footer.jsp" %>