package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieDTO;

public class MovieUpdateAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/movie/movieUpdate.jsp";
		
//		String title=request.getParameter("code");
//		
//		MovieDTO movieDTO =  new MovieDTO();
//		
//		movieDTO.setCode(Integer.parseInt(request.getParameter("code")));
//		movieDTO.setTitle(request.getParameter("title"));
//		movieDTO.setGrade(request.getParameter("grade"));
//		movieDTO.setDirector(request.getParameter("director"));
//		movieDTO.setActor(request.getParameter("actor"));
//		movieDTO.setSynopsis(request.getParameter("synopsis"));
//		movieDTO.setImage(request.getParameter("image"));
//		System.out.println(request.getParameter("code"));
//		System.out.println(movieDTO);
//		System.out.println(movieDTO.getTitle());
//		
//		MovieDAO mDAO = MovieDAO.getInstance();
//		mDAO.updateMovie(movieDTO);
//		
//		MovieDTO mlist = mDAO.selectMovieByTitle(title);
//		
//		request.setAttribute("movie", mlist);
		MovieDTO movieDTO =  new MovieDTO();
	     
		  movieDTO.setTitle(request.getParameter("title"));
	      movieDTO.setGrade(request.getParameter("grade"));
	      movieDTO.setDirector(request.getParameter("director"));
	      movieDTO.setActor(request.getParameter("actor"));
	      movieDTO.setSynopsis(request.getParameter("synopsis"));
	      movieDTO.setImage(request.getParameter("image"));

	      String title=request.getParameter("code");
	      

	      MovieDAO mDAO = MovieDAO.getInstance();
	      MovieDTO mlist = mDAO.selectMovieByTitle(title);
	      mDAO.updateMovie(movieDTO);
	      
	      request.setAttribute("movie", mlist);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
