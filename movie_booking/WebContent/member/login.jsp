<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 
<div id="wrapper">
	<h2 align="center">로그인</h2>
	
	 
	<form method="post" name="frm" action="MemberFC?command=login">
		<table align="center">
			<tr>
				<td align="center">아이디</td>
				<td><input type="text" name="userid" value="${userid}"}></td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td><input type="password" name="pwd" value="${pwd}"></td>
			</tr>
			<tr>
				<td align="center">구분</td>
				<td><select name="group">
					<option value="user">일반회원</option>
					<option value="admin">관리자</option>
				</select></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<div id="buttons">
						<input type="submit" value="로그인" class="submit" onclick="return loginCheck()">
						<input type="button" value="회원가입" class="cancel"
							onclick="location='MemberFC?command=join_form'">
							
						<input type="button" value="아이디/비밀번호 찾기" class="submit"
							onclick="location='MemberFC?command=find_id_form'">		
					</div>	
				</td>
			</tr>
			<tr align="center">
				<td colspan="2" align="center">
					${message}
				</td>
			</tr>
		</table>
	</form>
</div>
<%@ include file="../footer.jsp" %>
 