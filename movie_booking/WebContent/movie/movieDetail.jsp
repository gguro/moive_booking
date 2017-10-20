<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>영화 상세정보</h2>
      <div class="item_detail">
        <div class="spec">
          <div class="title">${movie.title}</div>
          <dl>
            <dt>평점</dt>
            <dd>${movie.grade}</dd>
          </dl>
          <dl>
            <dt>감독</dt>
            <dd>${movie.director}</dd>
          </dl>
          <dl>
            <dt>배우</dt>
            <dd>${movie.actor}</dd>
          </dl>
          <dl>
            <dt>줄거리</dt>
            <dd>
              ${movie.synopsis}
            </dd>
          </dl>
        </div>
        <div class="poster">
         <!--  <img src="../images/movie_image1.jpg" alt=""> -->
         <img src="${movie.image}" alt="" />
        </div>
        <div class="btn_ud">
          <a href="/movie_booking/MovieFC?command=movieUpdateForm&code=${movie.code}">수정</a>
          <a href="/movie_booking/MovieFC?command=movieDelete&code=${movie.code}">삭제</a>
        </div>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
