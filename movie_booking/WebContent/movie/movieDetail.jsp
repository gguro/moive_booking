<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>영화 상세정보</h2>
      <div class="item_detail">
        <div class="spec">
          <div class="title">${movie.mv_title}</div>
          <dl>
            <dt>감독</dt>
            <dd>${movie.mv_director}</dd>
          </dl>
          <dl>
            <dt>배우</dt>
            <dd>${movie.mv_cast}</dd>
          </dl>
          <dl>
            <dt>줄거리</dt>
            <dd>
              ${movie.mv_synopsis}
            </dd>
          </dl>
        </div>
        <div class="poster">
         <!--  <img src="../images/movie_image1.jpg" alt=""> -->
         <img src="images/${movie.mv_imglink1}" alt="" />
        </div>
        <c:if test="${loginUser.usergroup == 'admin'}">
        <div class="btn_ud">
          <a href="MovieFC?command=movieUpdateForm&mv_code=${movie.mv_code}">수정</a>
          <a href="MovieFC?command=movieDelete&mv_code=${movie.mv_code}">삭제</a>
        </div>
        </c:if>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
