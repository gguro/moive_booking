<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div id="wraper">

<h2> 예약 확인창 </h2>

	<form action="BookFC?command=bookrequest" name="frm" method="post">
		<input type="hidden" name="userid" value=${loginUser.userid}>
		예약 코드<input type="text" name="bk_code" size="10">
		좌석 코드<input type="text" name="st_code" value="${st_code}">
		예약 날짜<input type="text" name="bk_date">
		예약 상태<input type="text" name="bk_status">
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>

</div>
<%@ include file="../footer.jsp" %>