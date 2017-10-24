<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.jsp" %>

	<div class="container">
		<div class="jumbotron">
			<div class="card-deck">
				<c:forEach items="${mlist}" var="movie">
					<div class="card col-3" style="padding: 0;">
					  <img class="card-img-top" src="images/${movie.mv_imglink1}" alt="">
					  <div class="card-body">
					    <h4 class="card-title">${movie.mv_title}</h4>
					    <p class="card-text"></p>
					    <a href="MovieFC?command=movieDetail&mv_code=${movie.mv_code}" class="btn btn-danger">상세보기</a>
					    <a href="SeatFC?command=seatpartlistbymvcode&mv_code=${movie.mv_code}" class="btn btn-outline-danger">예매하기</a>
					  </div>
					</div>
       			</c:forEach>
			</div>
		</div>
	</div>
  
<%@ include file="../footer.jsp" %>
