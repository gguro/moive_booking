<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  
  <div class="container">
    <div class="con1">
      <h2>좌석 등록</h2>
      <div class="item_form">
        <form class="" action="SeatFC?command=seatWrite" enctype="multipart/form-data" method="post">
          <div class="row">
            <span>좌석코드</span>
            <input type="text" name="st_code" value="" >
          </div>
          <div class="row">
            <span>상영번호</span>
            <input type="text" name="sh_code" value="">
          </div>
          <div class="row">
            <span>행</span>
            <input type="text" name="st_col" value="">
          </div>
          <div class="row">
            <span>열</span>
             <input type="text" name="st_row" value="">
          </div>
          <div class="row">
            <input type="submit" name="" value="등록">
          </div>
        </form>
      </div>
    </div>
  </div>
<%@ include file="../footer.jsp" %>
