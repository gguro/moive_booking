<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div id="wraper">
	<h2 align="center">회원정보 수정</h2>
	<form action="MemberFC?command=memberupdate" method="post" name="frm">
		<table>
			<tr>
				<td>이름</td>
				<td>${loginUser.name}</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
					${loginUser.userid}
					<input type="hidden" name="userid" value="${loginUser.userid}">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input type="password" name="pwd" value="${loginUser.pwd}">
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td>
					<input type="password" value="${loginUser.pwd}">
				</td>
			</tr>
			<tr>
				<td>휴대폰 번호</td>
				<td>
					<input type="text" name="phone" value="${loginUser.phone}">
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input type="text" name="email" value="${loginUser.email}">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="취소" onclick="MemberFC?command=index">
					<input type="submit" value="확인" />
				</td>
			</tr>
		</table>
	</form>
</div>



<%@ include file="../footer.jsp"%>