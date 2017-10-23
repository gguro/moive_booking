package com.movie.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;
import com.movie.dto.MovieDTO;

public class ShowUpdateFormAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/show/showupdateform.jsp";
		
		// movie list 얻어 와서 setAttribute
		MovieDAO mvDAO = MovieDAO.getInstance();
		List<MovieDTO> movieList = mvDAO.selectAllMovie();
		request.setAttribute("movielist", movieList);
		
		// theater list 얻어 와서 setAttribute
		TheaterDAO thDAO = TheaterDAO.getInstance();
		List<String> theaterList = thDAO.getTheatorList();
		request.setAttribute("theaterlist", theaterList);
		
		// showroom list 얻어와서 setAttribute
		ShowroomDAO srDAO = ShowroomDAO.getInstance();
		List<String> showroomList = srDAO.getShowroomList();
		request.setAttribute("showroomlist", showroomList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
