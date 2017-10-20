<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>영화 수정</h2>
      <div class="item_form">
        <form class="" action="MovieFC?command=movieUpdate" enctype="multipart/form-data" method="post">
          <div class="row">
          <input type="hidden"  name="mv_code" value="${movie.mv_code}">
            <span>제목</span>
            <input type="text" name="mv_title" value="${movie.mv_title}" >
          </div>
          <div class="row">
            <span>감독</span>
            <input type="text" name="mv_director" value="${movie.mv_director}">
          </div>
          <div class="row">
            <span>배우</span>
            <input type="text" name="mv_cast" value="${movie.mv_cast}">
          </div>
          <div class="row">
            <span>줄거리</span>
            <textarea name="mv_synopsis">${movie.mv_synopsis}</textarea>
          </div>
          <div class="row">
            <span>첨부파일</span>
            <input type="file" name="mv_imglink1" >
          </div>
          <div class="row">
            <input type="submit" name="" value="수정">
          </div>
        </form>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
