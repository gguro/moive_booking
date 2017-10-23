package com.movie.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.FullseatviewDAO;
import com.movie.dao.MovieDAO;
import com.movie.dao.ShowviewDAO;
import com.movie.dto.FullseatviewDTO;
import com.movie.dto.MovieDTO;
import com.movie.dto.ShowviewDTO;



public class SeatFulllistAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/seat/seatfulllist.jsp";
		
		//
		ShowviewDAO shvDAO = ShowviewDAO.getInstance();
		List<ShowviewDTO> showviewList = shvDAO.getShowviewList();
		
		request.setAttribute("showviewlist", showviewList);
		
		//��ȭ����
		MovieDAO movieDAO = MovieDAO.getInstance();
		List<MovieDTO> mlist = movieDAO.selectAllMovie();
		
		request.setAttribute("mlist", mlist);
		
		//��ü �¼�����
		FullseatviewDAO fsvDao = FullseatviewDAO.getInstance();
		
		List<FullseatviewDTO> fsvList = fsvDao.getFullSeatListAll();
		
		request.setAttribute("seatfulllist", fsvList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
