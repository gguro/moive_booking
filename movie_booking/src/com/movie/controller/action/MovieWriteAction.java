package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.movie.dao.MovieDAO;
import com.movie.dto.MovieDTO;

public class MovieWriteAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MovieDTO movieDTO = new MovieDTO();
		
		movieDTO.setTitle(request.getParameter("title"));
		movieDTO.setGrade(request.getParameter("grade"));
		movieDTO.setDirector(request.getParameter("director"));
		movieDTO.setActor(request.getParameter("actor"));
		movieDTO.setSynopsis(request.getParameter("synopsis"));
		movieDTO.setImage(request.getParameter("image"));
		
		MovieDAO mDao = MovieDAO.getInstance();
		mDao.insertMovie(movieDTO);
		
		response.sendRedirect("MovieFC?command=movieList");
	}

}
