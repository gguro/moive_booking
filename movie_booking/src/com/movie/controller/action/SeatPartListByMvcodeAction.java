package com.movie.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.FullseatviewDAO;
import com.movie.dao.ShowviewDAO;
import com.movie.dto.FullseatviewDTO;
import com.movie.dto.ShowviewDTO;

public class SeatPartListByMvcodeAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/seat/seatfulllist.jsp";
		
		ShowviewDAO shvDAO = ShowviewDAO.getInstance();
		List<ShowviewDTO> showviewList = shvDAO.getShowviewList();
		
		request.setAttribute("showviewlist", showviewList);
		
		
		FullseatviewDAO fsvDao = FullseatviewDAO.getInstance();
		
		// mv_code, th_name, sr_name, showtime
		
		String mv_code = request.getParameter("mv_code");
		
		System.out.println("mv_code : " + mv_code);
		request.setAttribute("mv_code", mv_code);
		
		List<FullseatviewDTO> fsvList = 
				fsvDao.getFullSeatListByMv_code(mv_code);
				
		
		request.setAttribute("seatfulllist", fsvList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
