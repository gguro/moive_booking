package com.movie.controller.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;


public class MovieDeleteAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mv_code = request.getParameter("mv_code");

		MovieDAO mDao=MovieDAO.getInstance();
		mDao.deleteMovie(mv_code);
		
		new MovieListAction().execute(request, response);
	}
       
  

}
