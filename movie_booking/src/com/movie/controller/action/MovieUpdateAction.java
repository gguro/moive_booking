package com.movie.controller.action;

import java.io.IOException;

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
		String mv_code = multi.getParameter("mv_code");
		String mv_title = multi.getParameter("mv_title");
		String mv_director = multi.getParameter("mv_director");
		String mv_cast = multi.getParameter("mv_cast");
		String mv_imglink1 = multi.getFilesystemName("mv_imglink1");
		String mv_synopsis = multi.getParameter("mv_synopsis");
		if (mv_imglink1 == null) {
			mv_imglink1 = multi.getParameter("nonmakeImg");
		}

		MovieDTO movieDTO =  new MovieDTO();
	     
		  movieDTO.setMv_code(mv_code);
		  movieDTO.setMv_title(mv_title);
	      movieDTO.setMv_director(mv_director);
	      movieDTO.setMv_cast(mv_cast);
	      movieDTO.setMv_imglink1(mv_imglink1);
	      movieDTO.setMv_synopsis(mv_synopsis);

	      MovieDAO mDao = MovieDAO.getInstance();

	      mDao.updateMovie(movieDTO);
	      
	      response.sendRedirect("MovieFC?command=movieList");
		
	      
	}



}
