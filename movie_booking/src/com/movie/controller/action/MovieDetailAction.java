package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieDTO;

public class MovieDetailAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "movie/movieDetail.jsp";
		
		String mv_code=request.getParameter("mv_code");
		MovieDAO movieDAO = MovieDAO.getInstance();
		MovieDTO mlist = movieDAO.selectMovieByTitle(mv_code);
	
		request.setAttribute("movie", mlist);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
