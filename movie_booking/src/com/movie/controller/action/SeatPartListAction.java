package com.movie.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.FullseatviewDAO;
import com.movie.dto.FullseatviewDTO;

public class SeatPartListAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/seat/seatfulllist.jsp";
		FullseatviewDAO fsvDao = FullseatviewDAO.getInstance();
		
		// mv_code, th_name, sr_name, showtime
		
		String mv_code = request.getParameter("mv_code");
		String th_name = request.getParameter("th_name");
		String sr_name = request.getParameter("sr_name");
		String showtime = request.getParameter("showtime");
		int time = 1;
		try {
			time = Integer.parseInt(showtime);
		} catch (Exception e){
			
		}
		
		List<FullseatviewDTO> fsvList = 
				fsvDao.getFullSeatListByMv_codeTh_nameSr_nameShowtime(mv_code, th_name, sr_name, time);
		
		request.setAttribute("seatfulllist", fsvList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
