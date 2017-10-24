<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="jumbotron col-md-6">
				<form class="form-horizontal" action="MovieFC?command=movieWrite" enctype="multipart/form-data" method="post">
					<div class="form-group">
				      <label for="t11">영화코드</label>
				      <input type="text" id="t11" class="form-control" placeholder="영화코드" name="mv_code">
				    </div>
					<div class="form-group">
				      <label for="t1">영화제목</label>
				      <input type="text" id="t1" class="form-control" placeholder="영화제목" name="mv_title">
				    </div>
				    <div class="form-group">
				      <label for="t2">감독</label>
				      <input type="text" id="t2" class="form-control" placeholder="감독" name="mv_director">
				    </div>
				    <div class="form-group">
				      <label for="t3">배우</label>
				      <input type="text" id="t3" class="form-control" placeholder="배우" name="mv_cast">
				    </div>
					<div class="form-group">
						<label for="t4">줄거리</label>
						<textarea class="form-control" id="t4" rows="10" placeholder="줄거리" name="mv_synopsis"></textarea>
					</div>
					<div class="form-group">
						<label for="t5">이미지</label>
						<input type="file" class="form-control-file" id="t5" name="mv_imglink1">
					</div>
					<div class="form-group">
						<div class="">
							<button type="submit" class="btn btn-default btn-primary">등록</button>
							<button type="button" class="btn btn-default" onclick="history.go(-1)">취소</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	
<%@ include file="../footer.jsp" %>
