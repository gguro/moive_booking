<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  

<div id="wrapper">
	<h2>아이디 찾기</h2>

	<form action="MemberFC?command=find_id_check_form" method="post" name=frm>
		email<input type="text" name="email" value="${email}">
			 <input type="submit" value="검색" class="submit"><br>
	
		<c:if test="${result == 1}">
			아이디는 ${userid} 입니다.
		</c:if>
		<c:if test="${result == -1}">
			입력하신 이메일에 해당하는 아이디가 없습니다.
		</c:if>
	</form>
</div>
<%@ include file="../footer.jsp" %>