<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>  

  <div class="container">
    <div class="con1">
      <h2>영화 목록</h2>
      <div class="item_wrap">
        <ul>

         <c:forEach items="${mlist}" var="movie">
          <li>
            <img src="images/${movie.image}" alt="">
            <div class="des">
              <div class="title">
              	${movie.title}
              </div>
              <div class="btn_wrap">
                <a href="/movie_booking/MovieFC?command=movieDetail&code=${movie.code}">상세정보</a>
                <a href="">예약</a>
              </div>
            </div>
          </li>
           </c:forEach>
        </ul>
      </div>
      <a href="/movie_booking/MovieFC?command=movieWriteForm">글쓰기</a>
    </div>
  </div>
  
<%@ include file="../footer.jsp" %>
