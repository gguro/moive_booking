<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="jumbotron">
				<h3>아이디/비밀번호 찾기</h3>
				<form method="post" action="MemberFC?command=find" name="frm">
				  <div class="form-group row" >
				    <label for="id" class="col-sm-4 col-form-label">아이디 찾기</label>
				    <div class="col-sm-8">
				      <input type="text" class="form-control" id="id" placeholder="이메일 입력" name="email">
						<input type="hidden" name="reid" size="20">
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="pwd" class="col-sm-4 col-form-label">비밀번호 찾기</label>
				    <div class="col-sm-8">
				      <input type="password" class="form-control" id="pwd" placeholder="아이디 입력" name="userid">
						<input type="hidden" name="reid" size="20">
				    </div>
				  </div>
				    <button class="btn btn-outline-primary" type="button" onclick="find_email_Check()">아이디 찾기</button>
				    <button class="btn btn-outline-primary" type="button" onclick="find_id_Check()">비밀번호 찾기</button>
				</form>
			</div>
		</div>
		<div class="col-md-3"></div>
	</div>
</div>


<%@ include file="../footer.jsp" %>