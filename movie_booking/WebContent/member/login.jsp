<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 

<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>로그인</h3>
				<form method="post" action="MemberFC?command=login">
				  <div class="form-group row" >
				    <label for="id" class="col-sm-4 col-form-label">아이디</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="id" placeholder="아이디" name="userid">
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="pwd" class="col-sm-4 col-form-label">비밀번호</label>
				    <div class="col-sm-8">
				      <input type="password" class="form-control" id="pwd" placeholder="비밀번호" name="pwd">
				    </div>
				  </div>
				    <div class="form-group row">
				      <label for="group" class="col-sm-4 col-form-label">구분</label>
				      <div class="col-sm-8">
					      <select id="group" class="form-control" name="group">
					      	<option value="user">일반</option>
							<option value="admin">관리자</option>
					      </select>
				      </div>
				    </div>
				    <button class="btn btn-primary" type="submit" onclick="return loginCheck()">로그인</button>
				    <button class="btn btn-outline-primary" type="button" onclick="location='MemberFC?command=join_form'">회원가입</button>
				    <button class="btn btn-outline-primary" type="button" onclick="location='MemberFC?command=find_form'">아이디/비밀번호 찾기</button>
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>
	
<%@ include file="../footer.jsp" %>
 
