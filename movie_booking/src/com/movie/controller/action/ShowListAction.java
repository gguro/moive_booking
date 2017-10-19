package com.movie.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MovieDAO;
import com.movie.dao.ShowDAO;
import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;
import com.movie.dto.MovieDTO;
import com.movie.dto.ShowDTO;
import com.movie.dto.ShowFullDTO;

public class ShowListAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/show/showlist.jsp";
		
		// show list 얻어옴.
		ShowDAO shDAO = ShowDAO.getInstance();
		List<ShowDTO> showList = shDAO.getShowList();
		
		// movie list 얻어옴
		MovieDAO mvDAO = MovieDAO.getInstance();
		//List<MovieDTO> movieList = mvDAO.selectAllMovie();
		
		// theater list 얻어옴
		TheaterDAO thDAO = TheaterDAO.getInstance();
		//List<String> theaterList = thDAO.getTheatorList();
		
		// showroom list 얻어옴
		ShowroomDAO srDAO = ShowroomDAO.getInstance();
		//List<String> showroomList = srDAO.getShowroomList();
		
		List<ShowFullDTO> shfDTOList = new ArrayList<ShowFullDTO>();
		
		for(ShowDTO show : showList) {
			ShowFullDTO sfDTO = new ShowFullDTO();
			sfDTO.setSH_CODE(show.getSH_CODE());
			sfDTO.setSH_STATUS(show.getSH_STATUS());
			sfDTO.setMvDTO(mvDAO.selectMovieByCode(show.getMV_CODE()));
			sfDTO.setSrDTO(srDAO.getShowroomByCode(show.getSR_CODE()));
			sfDTO.setThDTO(thDAO.getTheatterByCode(show.getTH_CODE()));
			
		}
		
		request.setAttribute("showfulllist", shfDTOList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}


	
}
