<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div id="wraper">
	<h2>회원정보 수정</h2>
	<form action="MemberFC?command=memberupdate" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>비밀번호 확인</td>
				<td>휴대폰 번호</td>
				<td>이메일</td>
			</tr>
			<tr>
				<td>${loginUser.name}</td>
				<td>
					${loginUser.userid}
					<input type="hidden" name="userid" value="${loginUser.userid}">
				</td>
				<td>
					<input type="password" name="pwd" value="${loginUser.pwd}">
				</td>
				<td>
					<input type="password" value="${loginUser.pwd}">
				</td>
				<td>
					<input type="text" name="phone" value="${loginUser.phone}">
				</td>
				<td>
					<input type="text" name="email" value="${loginUser.email}">
				</td>
			</tr>
		</table>
		<a href="index.jsp">취소</a> 
		<input type="submit" value="확인" />
	</form>
</div>



<%@ include file="../footer.jsp"%>