<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
<div>
<h2>전체 좌석 정보</h2>
<form action="SeatFC?command=seatpartlist"  method="post">
	<table>
		<tr>
			<th>영화코드</th>
			<th>극장</th>
			<th>상영관</th>
			<th>회차</th>
			<th>검색</th>
		</tr>
		<tr>
			<td>
				<select name="mv_code" style="width: 200px">
					<c:forEach var="mlist" items="${showviewlist}">
						<option value="${mlist.mv_code}">${mlist.mv_code}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<select name="th_name" style="width: 200px">
					<c:forEach var="showviewlist" items="${showviewlist}">
						<option value="${showviewlist.th_name}">${showviewlist.th_name}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<select name="sr_name" style="width: 200px">
					<c:forEach var="showviewlist" items="${showviewlist}">
						<option value="${showviewlist.sr_name}">${showviewlist.sr_name}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<select name="showtime" style="width: 200px">
					<c:forEach var="showviewlist" items="${showviewlist}">
						<option value="${showviewlist.showtime}">${showviewlist.showtime}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input type="submit" value="검색">
			</td>
		</tr>
	</table>
</form>
<table class="list">
	<tr>
		<th>상영번호</th>
		<th>영화코드</th>
		<th>상영관코드</th>
		<th>극장이름</th>
		<th>상영관이름</th>
		<th>상영회차</th>
		<th>상영시간</th>
		<th>상영상태</th>
		<th>좌석코드</th>
		<th>사용여부</th>
		<th>예약</th>
	</tr>
	<c:forEach var="seatfulllist" items="${seatfulllist}">
		<tr class="record">
			<td>${seatfulllist.sh_code}</td>
			<td>${seatfulllist.mv_code}</td>
			<td>${seatfulllist.sr_code}</td>
			<td>${seatfulllist.th_name}</td>
			<td>${seatfulllist.sr_name}</td>
			<td>${seatfulllist.showtime}</td>
			<td>${seatfulllist.localtime}</td>
			<td>${seatfulllist.sh_status}</td>
			<td>${seatfulllist.st_code}</td>
			<td>${seatfulllist.st_useyn}</td>
			<td>
				<form action ="BookFC?command=bookconfirmform" method="post">
					<input type="hidden" name="st_code" value="${seatfulllist.st_code}">
					<input type="submit" value="예약">
				</form>
				
			</td>
		</tr>
	</c:forEach>
</table>



</div>
  
<%@ include file="../footer.jsp" %>
