<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  




<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>상영 등록</h3>
				<form method="post" action="ShowFC?command=showupdate" name="frm">
				  <div class="form-group row" >
				    <label for="th_code" class="col-sm-4 col-form-label">극장코드</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="th_code" placeholder="th_code" name="th_code">
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="sr_code" class="col-sm-4 col-form-label">상영관코드</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="sr_code" placeholder="sr_code" name="sr_code">
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="sh_code" class="col-sm-4 col-form-label">상영코드</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="sh_code" placeholder="sh_code" name="sh_code">
				    </div>
				  </div>
				  <div class="form-group row" >
				    <label for="mv_code" class="col-sm-4 col-form-label">영화코드</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="mv_code" placeholder="mv_code" name="mv_code">
				    </div>
				  </div>
				  <div class="form-group row" >
				    <label for="showtime" class="col-sm-4 col-form-label">상영회차</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="showtime" placeholder="showtime" name="showtime">
				    </div>
				  </div>
				    <div class="form-group row">
				      <label for="sh_status" class="col-sm-4 col-form-label">상영상태</label>
				      <div class="col-sm-8">
					      <select id="sh_status" class="form-control" name="sh_status">
					      	<option value="대기">대기</option>
							<option value="상영">상영</option>
					      </select>
				      </div>
				    </div>
				    <button class="btn btn-primary" type="submit" >확인</button>
				    <button class="btn btn-outline-primary" type="button" onclick="history.go(-1)">취소</button>
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>


<%@ include file="../footer.jsp" %>