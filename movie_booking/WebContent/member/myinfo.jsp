<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>회원가입</h3>
				<form method="post" action="MemberFC?command=join" name="frm">
				  <div class="form-group row" >
				    <label for="id" class="col-sm-4 col-form-label">아이디</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="id" placeholder="아이디" name="userid" value="${loginUser.userid}" disabled>
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="pwd" class="col-sm-4 col-form-label">비밀번호</label>
				    <div class="col-sm-8">
				      <input type="password" class="form-control" id="pwd" placeholder="비밀번호" name="pwd" value="${loginUser.pwd}">
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="pwd2" class="col-sm-4 col-form-label">비밀번호 확인</label>
				    <div class="col-sm-8">
				      <input type="password" class="form-control" id="pwd2" placeholder="비밀번호 확인" name="pwd_check" value="${loginUser.pwd}">
				    </div>
				  </div>
				  <div class="form-group row" >
				    <label for="name" class="col-sm-4 col-form-label">이름</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="name" placeholder="이름" name="name" value="${loginUser.name}" disabled>
				    </div>
				  </div>
				  <div class="form-group row" >
				    <label for="phone" class="col-sm-4 col-form-label">핸드폰</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="phone" placeholder="핸드폰" name="phone" value="${loginUser.phone}">
				    </div>
				  </div>
				  <div class="form-group row" >
				    <label for="email" class="col-sm-4 col-form-label">이메일</label>
				    <div class="col-sm-8">
				      <input type="email" class="form-control" id="phone" placeholder="이메일" name="email" value="${loginUser.phone}">
				    </div>
				  </div>
				    <div class="form-group row">
				      <label for="group" class="col-sm-4 col-form-label">구분</label>
				      <div class="col-sm-8">
					      <select id="group" class="form-control" name="usergroup">
					      	<option value="user">일반</option>
							<option value="admin">관리자</option>
					      </select>
				      </div>
				    </div>
				    <button class="btn btn-primary" type="submit">확인</button>
				    <button class="btn btn-outline-primary" type="button" onclick="history.go(-1)">취소</button>
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>

<%@ include file="../footer.jsp"%>