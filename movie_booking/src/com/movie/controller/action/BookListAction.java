package com.movie.controller.action;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.BookDAO;
import com.movie.dto.BookDTO;


public class BookListAction implements IAction {

	@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String url = "/book/bookList.jsp";
	
    BookDAO bookDAO = BookDAO.getInstance();
	ArrayList<BookDTO> list = bookDAO.selectAllBook();
	
	System.out.println(list);
	request.setAttribute("list", list);
	
	
	RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	dispatcher.forward(request, response);
}



}
