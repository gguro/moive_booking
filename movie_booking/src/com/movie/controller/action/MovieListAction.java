package com.movie.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieDTO;



public class MovieListAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "movie/movieList.jsp";
		
		MovieDAO movieDAO = MovieDAO.getInstance();
		List<MovieDTO> mlist = movieDAO.selectAllMovie();
		
		request.setAttribute("mlist", mlist);
		System.out.println(mlist);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

		
	}
       
   
}
