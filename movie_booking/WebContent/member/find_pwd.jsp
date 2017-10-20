<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  

<div id="wrapper">
	<h2>패스워드 찾기</h2>

	<form action="MemberFC?command=find_pwd_check_form" method="post" name=frm>
		ID<input type="text" name="userid" value="${userid}">
			 <input type="submit" value="검색" class="submit"><br>
	
		<c:if test="${result == 1}">
			패스워드는 ${pwd} 입니다.
		</c:if>
	</form>
</div>
<%@ include file="../footer.jsp" %>