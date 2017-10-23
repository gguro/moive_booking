package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.ShowDAO;
import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;
import com.movie.dto.ShowDTO;
import com.movie.dto.ShowroomDTO;
import com.movie.dto.TheaterDTO;

public class BookConfirmFormAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/book/bookconfirmform.jsp";

		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
