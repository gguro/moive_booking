<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<div class="container">
		<div class="jumbotron">
			<div class="row">
               	<div class="col-md-2"></div> 
            	<div class="col-md-4 item-photo">
                    <img style="max-width:100%;" src="images/${movie.mv_imglink1}" />
                </div>
                <div class="col-md-4" style="border:0px solid gray">
                    <h3>${movie.mv_title}</h3>    
                    <h6 style="color:#337ab7">MAN OF WILL <small style="color:#337ab7">(2017)</small></h6>
                    <h3 style="margin: 20px 0 20px;">평점 <span>9.99</span></h3>
                    <h6 style="font-size: 14px;">개요 <span>드라마 | 한국 | 115분 | 2017.10.19 개봉</span></h6>
                    <h6 style="font-size: 14px;">감독 <span>${movie.mv_director}</span></h6>
                    <h6 style="font-size: 14px;">배우 <span>${movie.mv_cast}</span></h6>
                    <h6 style="font-size: 14px;">등급 <span>[국내] 12세 관람가</span></h6>
                    <h6 style="font-size: 14px;">흥행 <span>예매율 3위</span></h6>
                    <div class="section" style="margin-top: 30px;padding-bottom:20px;">
                     <a class="btn btn-success" href="SeatFC?command=seatpartlistbymvcode&mv_code=${movie.mv_code}">예매하기</a>
                        
						<c:if test="${loginUser.usergroup == 'admin'}">
							<a href="MovieFC?command=movieUpdateForm&mv_code=${movie.mv_code}" class="btn btn-outline-danger">수정</a>
							<a href="MovieFC?command=movieDelete&mv_code=${movie.mv_code}" class="btn btn-outline-danger">삭제</a>
						</c:if>
                    </div>
                </div>                              
                <div class="col-md-2"></div>
            </div>
               <div class="row">
               	<div class="col-md-2"></div>   
               	<div class="col-md-8">
                   	<div style="width:100%;margin-top: 30px;border-top:1px solid silver;">
                        <span style="margin-top:20px;padding:15px 15px 0 15px;font-size: 20px;display: inline-block;">줄거리</span>
                        <p style="padding:15px;">
                            <small>
								${movie.mv_synopsis}
                            </small>
                        </p>
                   	</div>
                   </div>
                   <div class="col-md-2"></div>   
               </div>
		</div>
	</div>
	
<%@ include file="../footer.jsp" %>
