package com.movie.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;

public class ShowUpdateFormAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/show/showupdateform.jsp";
		
		// movie list 얻어 와서 setAttribute
		
		
		
		// theater list 얻어 와서 setAttribute
		TheaterDAO thDAO = TheaterDAO.getInstance();
		ArrayList<String> theaterList = thDAO.getTheatorList();
		
		request.setAttribute("theaterList", theaterList);
		
		
		// showroom list 얻어와서 setAttribute
		ShowroomDAO srDAO = ShowroomDAO.getInstance();
		ArrayList<String> showroomList = srDAO.getShowroomList();
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
