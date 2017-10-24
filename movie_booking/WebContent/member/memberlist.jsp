<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-0"></div>
		<div class="jumbotron col-md-12">
		<h2 class="text-center">회원 목록</h2>
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">아이디</th>
			      <th scope="col">패스워드</th>
			      <th scope="col">이름</th>
			      <th scope="col">연락처</th>
			      <th scope="col">이메일</th>
			      <th scope="col">구분</th>
			      <th scope="col"></th>
			    </tr>
			  </thead>
			  <tbody>
				<c:forEach var="list" items="${memberList}">
				    <tr>
				        <th scope="row">${list.userid}</th>
						<td>${list.pwd}</td>
					    <td>${list.name}</td>
						<td>${list.phone}</td>
						<td>${list.email}</td>
						<td>${list.usergroup}</td>
						<td><a href="MemberFC?command=memberdelete&userid=${list.userid}">탈퇴</a></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="col-md-0"></div>
	</div>
</div>

<%@ include file="../footer.jsp"%>