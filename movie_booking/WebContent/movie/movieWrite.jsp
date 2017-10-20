<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>영화 등록</h2>
      <div class="item_form">
        <form class="" action="MovieFC?command=movieWrite" method="post">
          <div class="row">
            <span>제목</span>
            <input type="text" name="title" value="" >
          </div>
          <div class="row">
            <span>평점</span>
            <input type="text" name="grade" value="" >
          </div>
          <div class="row">
            <span>감독</span>
            <input type="text" name="director" value="">
          </div>
          <div class="row">
            <span>배우</span>
            <input type="text" name="actor" value="">
          </div>
          <div class="row">
            <span>줄거리</span>
            <textarea name="synopsis"></textarea>
          </div>
          <div class="row">
            <span>이미지</span>
            <input type="file"  name="image" />
          </div>
          <div class="row">
            <input type="submit" name="" value="등록">
          </div>
        </form>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
