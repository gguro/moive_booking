package com.movie.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.dao.BookDAO;
import com.movie.dto.BookDTO;
import com.movie.dto.MemberDTO;


public class BookListByUseridAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/book/bookList.jsp";
		
		HttpSession session = request.getSession();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginUser");
		if(memberDTO == null) {
			System.out.println("Login first!!!");
		} else {
			
			String userid = memberDTO.getUserid();
			
			System.out.println("Userid = " + userid);
			
			BookDAO bookDAO = BookDAO.getInstance();
			List<BookDTO> list = bookDAO.selectUserBook(userid);
			
			System.out.println("booklist : " + list);
			request.setAttribute("booklist", list);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}