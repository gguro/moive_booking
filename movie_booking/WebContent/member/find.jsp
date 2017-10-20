<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div id="wrapper">
	<h2>아이디/패스워드 찾기</h2>
	<form action="MemberFC?command=find" method="post" name="frm">
		<table>
			<tr>
				<td>아이디 찾기</td>
				<td>
					email<input type="text" name="email" size="20" id="email">
						<input type="hidden" name="reid" size="20">
						<input type="button" value="아이디 찾기" onclick="find_email_Check()">
				</td>
			</tr>
			<tr>
				<td>패스워드 찾기</td>
				<td>
					userid<input type="text" name="userid" size="20" id="userid">
						<input type="hidden" name="reid" size="20">
						<input type="button" value="패스워드 찾기" onclick="find_id_Check()">
				</td>
			</tr>
		</table>
	</form>
</div>

<%@ include file="../footer.jsp" %>