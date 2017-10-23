<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>


<div>
	<hr>
	<h3>기능테스트용 사이트맵</h3>
	
	회원 관련 페이지 >> 
	<a href="MemberFC?command=login_form">로그인폼</a> | 
	<a href="MemberFC?command=logout">로그아웃</a> |
	<a href="MemberFC?command=join_form">회원가입폼</a> |
	<a href="MemberFC?command=myinfo">내정보</a> | 
	<a href="MemberFC?command=find_form">아이디/암호 찾기</a> |
	<a href="MemberFC?command=find_id_check_form">아이디중복검사</a> |
	<br>
	<c:if test="${loginUser.usergroup == 'admin'}">
	관리자 관련 페이지 >>
	<a href="#">관리자 홈</a> |
	<a href="MemberFC?command=memberlist">회원리스트</a> |
	</c:if>
	<br>
	영화 관련 페이지>>
	<a href="MovieFC?command=movieList">영화리스트</a> |
	<c:if test="${loginUser.usergroup == 'admin'}">
		<a href="MovieFC?command=movieWriteForm">영화등록</a> |
	</c:if>
	<br>
	상영 관련 페이지>>
	<a href="ShowFC?command=getshowlist">상영리스트</a> |
	<c:if test="${loginUser.usergroup == 'admin'}">
		<a href="ShowFC?command=getshowupdateform">상영등록</a>
	</c:if>
	<br>
	
	좌석 관련 페이지>>
	<a href="SeatFC?command=seatfulllist">전체 좌석 리스트</a> |
	<c:if test="${loginUser.usergroup == 'admin'}">

		<a href="#">티켓등록</a>
	</c:if>
	<br>
	예약 관련 페이지>>
	<a href="BookFC?command=bookList">예약리스트</a> |
	<c:if test="${loginUser.usergroup == 'admin'}">
		<a href="SeatFC?command=seatWrite">예약등록</a>
	</c:if>
	<br>
</div>
</body>
</html>