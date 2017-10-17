<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 

<div id="wrapper">
	<h2>아이디 중복 확인</h2>

	<form action="MemberFC?command=id_check_form" method="post" name="frm">
		아이디 <input type="text" name="userid" value="${userid}">
			<input type="submit" value="검색" class="submit"><br>
					
		<c:if test="${result == 1}">
			${userid}는 이미 사용중입니다.
		</c:if>
		<c:if test="${result == -1}">
			${userid}는 사용 가능한 아이디입니다.
			<input type="button" value="사용" class="cancel" onclick="idok()">
		</c:if>
		
		
	</form>
 

</div>
<%@ include file="../footer.jsp" %>