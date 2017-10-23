<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  




<div id="wraper">
<h2 align="center"> 상영리스트 등록 </h2>
<form action="ShowFC?command=showupdate" method="post" name="frm">
	<h3>상영관 등록</h3>
	<table>
		<tr>
			<td>상영관 식별자 입력</td>
			<td>
				<input type="text" name="th_code" size="20" id="th_code">
			</td>
		</tr>
		<tr>
			<td>상영관 식별자</td>
			<td>
				<input type="text" name="sr_code" size="20" id="sr_code">
			</td>
		</tr>
		<tr>
			<td>상영관 이름</td>
			<td>
				<input type="text" name="sr_name" size="20" id="sr_name">
			</td>
		</tr>
		<tr>
			<td>좌석수</td>
			<td>
				<select name="sr_capacity" id="sr_capacity">
					<c:forEach var="i" begin="1" end="25">
						<option value="${i}">${i}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
	<h3>극장 등록</h3>
	<table>
		<tr>
			<td>극장 식별자</td>
			<td>
				<input type="text" name="th_code" size="20" id="th_code">
			</td>
		</tr>
		<tr>
			<td>극장이름</td>
			<td>
				<input type="text" name="th_name" size="20" id="th_name">
			</td>
		</tr>
		<tr>
			<td>위치</td>
			<td>
				<input type="text" name="th_location" size="20" id="th_location">
			</td>
		</tr>
	</table>
	<h3>상영정보 입력</h3>
	<table>
		<tr>
			<td>상영번호</td>
			<td>
				<input type="text" name="sh_code" size="20" id="sh_code">
			</td>
		</tr>
		<tr>
			<td>영화 식별자</td>
			<td>
				<input type="text" name="mv_code" size="20" id="mv_code">
			</td>
		</tr>
		<tr>
			<td>극장코드</td>
			<td>
				<input type="text" name="th_code" size="20" id="th_code">
			</td>
		</tr>
		<tr>
			<td>상영관코드</td>
			<td>
				<input type="text" name="sr_code" size="20" id="sr_code">
			</td>
		</tr>
		<tr>
			<td>상영회차</td>
			<td>
				<select name="showtime" id="showtime">
					<c:forEach var="i" begin="1" end="5">
						<option value="${i}">${i}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>상영상태</td>
			<td>
				<select name="sh_status" id="sh_status">
					<option value="대기">대기</option>
					<option value="상영">상영</option>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록">
			</td>
		</tr>
	</table>
</form>	
</div>





<%@ include file="../footer.jsp" %>