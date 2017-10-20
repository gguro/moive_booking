<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>영화 수정</h2>
      <div class="item_form">
        <form class="" action="MovieFC?command=movieUpdate" enctype="multipart/form-data" method="post">
          <div class="row">
          <input type="hidden"  name="code" value="${movie.code}">
            <span>제목</span>
            <input type="text" name="title" value="${movie.title}" >
          </div>
          <div class="row">
            <span>평점</span>
            <input type="text" name="grade" value="${movie.grade}" >
          </div>
          <div class="row">
            <span>감독</span>
            <input type="text" name="director" value="${movie.director}">
          </div>
          <div class="row">
            <span>배우</span>
            <input type="text" name="actor" value="${movie.actor}">
          </div>
          <div class="row">
            <span>줄거리</span>
            <textarea name="synopsis">${movie.synopsis}</textarea>
          </div>
          <div class="row">
            <span>첨부파일</span>
            <input type="file" name="image" >
          </div>
          <div class="row">
            <input type="submit" name="" value="수정">
          </div>
        </form>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
