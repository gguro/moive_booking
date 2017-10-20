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
            <img src="images/${movie.mv_imglink1}" alt="">
            <div class="des">
              <div class="title">
              	${movie.mv_title}
              </div>
              <div class="btn_wrap">
                <a href="MovieFC?command=movieDetail&mv_code=${movie.mv_code}">상세정보</a>
                <a href="">예약</a>
              </div>
            </div>
          </li>
           </c:forEach>
        </ul>
      </div>
    </div>
  </div>
  
<%@ include file="../footer.jsp" %>
