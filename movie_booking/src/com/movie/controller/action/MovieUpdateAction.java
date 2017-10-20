package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dto.MovieDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


public class MovieUpdateAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context = request.getServletContext();
        String path = context.getRealPath("images");
		String encType = "UTF-8";
		int sizeLimit = 20 * 1024 * 1024; //20M
		MultipartRequest multi 
		= new MultipartRequest(request, path, sizeLimit,
				encType, new DefaultFileRenamePolicy());
		String code = multi.getParameter("code");
		String title = multi.getParameter("title");
		String grade = multi.getParameter("grade");
		String director = multi.getParameter("director");
		String actor = multi.getParameter("actor");
		String synopsis = multi.getParameter("synopsis");
		String image = multi.getFilesystemName("image");
		
		if (image == null) {
			image = multi.getParameter("nonmakeImg");
		}

		MovieDTO movieDTO =  new MovieDTO();
	     
		  movieDTO.setCode(code);
		  movieDTO.setTitle(title);
	      movieDTO.setGrade(grade);
	      movieDTO.setDirector(director);
	      movieDTO.setActor(actor);
	      movieDTO.setSynopsis(synopsis);
	      movieDTO.setImage(image);

	      MovieDAO mDao = MovieDAO.getInstance();

	      mDao.updateMovie(movieDTO);
	      
	      response.sendRedirect("MovieFC?command=movieList");
		
	      
	}



}
