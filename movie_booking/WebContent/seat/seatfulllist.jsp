<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  

<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>예약</h3>
				<form method="post" action="SeatFC?command=seatpartlist" name="frm">
				    <div class="form-group row">
				      <label for="mv_code" class="col-sm-4 col-form-label">영화코드</label>
				      <div class="col-sm-8">
					      <select id="mv_code" class="form-control" name="mv_code">
					      	<% String strtest = "testtest"; %>
					      	
			<!-- mv_codeset.add(showview.getMv_code());
			th_nameset.add(showview.getTh_name());
			sr_nameset.add(showview.getSr_name());
			showtimeset.add(""+showview.getShowtime()); -->
					      	<c:forEach var="mv_code" items="${mv_codeset}">
							<option value="${mv_code}">${mv_code}</option>
							</c:forEach>
					      </select>
				      </div>
				    </div>
				    <div class="form-group row">
				      <label for="th_name" class="col-sm-4 col-form-label">극장</label>
				      <div class="col-sm-8">
					      <select id="th_name" class="form-control" name="th_name">
					      	<c:forEach var="th_name" items="${th_nameset}">
						<option value="${th_name}">${th_name}</option>
					</c:forEach>
					      </select>
				      </div>
				    </div>
				    <div class="form-group row">
				      <label for="sr_name" class="col-sm-4 col-form-label">상영관</label>
				      <div class="col-sm-8">
					      <select id="sr_name" class="form-control" name="sr_name">
					      	<c:forEach var="sr_name" items="${sr_nameset}">
						<option value="${sr_name}">${sr_name}</option>
					</c:forEach>
					      </select>
				      </div>
				    </div>
				    <div class="form-group row">
				      <label for="showtime" class="col-sm-4 col-form-label">회차</label>
				      <div class="col-sm-8">
					      <select id="showtime" class="form-control" name="showtime">
					      	<c:forEach var="showtime" items="${showtimeset}">
						<option value="${showtime}">${showtime}</option>
					</c:forEach>
					      </select>
				      </div>
				    </div>
				    <button class="btn btn-primary" type="submit" >검색</button>
				    <button class="btn btn-outline-primary" type="button" onclick="history.go(-1)">취소</button>
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-0"></div>
		<div class="jumbotron col-md-12">
		<h2 class="text-center">예약 현황</h2>
			<table class="table table-striped">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">상영번호</th>
			      <th scope="col">영화코드</th>
			      <th scope="col">상영관코드</th>
			      <th scope="col">극장이름</th>
			      <th scope="col">상영관이름</th>
			      <th scope="col">상영회차</th>
			      <th scope="col">상영시간</th>
			      <th scope="col">상영상태</th>
			      <th scope="col">좌석코드</th>
			      <th scope="col">사용여부</th>
			      <th scope="col">예약</th>
			    </tr>
			  </thead>
			  <tbody>
				<c:forEach var="showview" items="${seatfulllist}">
				    <tr>
						<th scope="row">"${showview.sh_code}"</th>
						<td>${showview.mv_code}</td>
						<td>${showview.sr_code}</td>
						<td>${showview.th_name}</td>
						<td>${showview.sr_name}</td>
						<td>${showview.showtime}</td>
						<td>${showview.localtime}</td>
						<td>${showview.sh_status}</td>
						<td>${showview.st_code}</td>
						<td>${showview.st_useyn}</td>
						<td>
							<form action ="BookFC?command=bookconfirmform" method="post">
								<input type="hidden" name="st_code" value="${showview.st_code}">
								<input type="submit" value="예약">
							</form>
						</td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="col-md-0"></div>
	</div>
</div>



</div>
  
<%@ include file="../footer.jsp" %>
