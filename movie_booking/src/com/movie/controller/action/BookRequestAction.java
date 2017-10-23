package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.ShowDAO;
import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;
import com.movie.dto.ShowDTO;
import com.movie.dto.ShowroomDTO;
import com.movie.dto.TheaterDTO;

public class BookRequestAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "BookFC?command=booklist";

		String sr_capaciry = request.getParameter("sr_capacity");
		String showtime = request.getParameter("showtime");

		/////////////////////////////////////////////
		ShowroomDTO srDTO = new ShowroomDTO();
		srDTO.setTheaterCode(request.getParameter("th_code"));
		srDTO.setShowroomCode(request.getParameter("sr_code"));
		srDTO.setShowroomName(request.getParameter("sr_name"));
		srDTO.setShowroomCapacity(Integer.parseInt(sr_capaciry));

		ShowroomDAO srDao = ShowroomDAO.getInstance();
		srDao.insertshowRoom(srDTO);
		
		///////////////////////////////////////////
		TheaterDTO tDTO = new TheaterDTO();
		tDTO.setTheaterCode(request.getParameter("th_code"));
		tDTO.setTheaterName(request.getParameter("th_name"));
		tDTO.setTheaterLocation(request.getParameter("th_location"));

		TheaterDAO tDao = TheaterDAO.getInstance();
		tDao.insertTheater(tDTO);

		//////////////////////////////////////////
		ShowDTO sDTO = new ShowDTO();
		sDTO.setSH_CODE(request.getParameter("sh_code"));
		sDTO.setMV_CODE(request.getParameter("mv_code"));
		sDTO.setTH_CODE(request.getParameter("th_code"));
		sDTO.setSR_CODE(request.getParameter("sr_code"));
		sDTO.setShowtime(Integer.parseInt(showtime));
		sDTO.setSH_STATUS(request.getParameter("sh_status"));

		ShowDAO sDao = ShowDAO.getInstance();
		sDao.insertShow(sDTO);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
