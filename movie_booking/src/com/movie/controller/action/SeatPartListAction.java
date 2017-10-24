package com.movie.controller.action;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.FullseatviewDAO;
import com.movie.dao.ShowviewDAO;
import com.movie.dto.FullseatviewDTO;
import com.movie.dto.ShowviewDTO;

public class SeatPartListAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/seat/seatfulllist.jsp";
		
		//
		ShowviewDAO shvDAO = ShowviewDAO.getInstance();
		List<ShowviewDTO> showviewList = shvDAO.getShowviewList();
		
		Set<String> mv_codeset = new TreeSet<String>();
		Set<String> th_nameset = new TreeSet<String>();
		Set<String> sr_nameset = new TreeSet<String>();
		Set<String> showtimeset = new TreeSet<String>();
		
		// mv_code list 추출
		for (ShowviewDTO showview : showviewList) {
			mv_codeset.add(showview.getMv_code());
			th_nameset.add(showview.getTh_name());
			sr_nameset.add(showview.getSr_name());
			showtimeset.add(""+showview.getShowtime());
		}
		
		//System.out.println("mv_codeset : " + mv_codeset);
		request.setAttribute("mv_codeset", mv_codeset);
		request.setAttribute("th_nameset", th_nameset);
		request.setAttribute("sr_nameset", sr_nameset);
		request.setAttribute("showtimeset", showtimeset);
		
		FullseatviewDAO fsvDao = FullseatviewDAO.getInstance();
		
		// mv_code, th_name, sr_name, showtime
		
		String mv_code = request.getParameter("mv_code");
		String th_name = request.getParameter("th_name");
		String sr_name = request.getParameter("sr_name");
		String showtime = request.getParameter("showtime");
		
		System.out.println("mv_code : " + mv_code);
		
		int time = 1;
		try {
			time = Integer.parseInt(showtime);
		} catch (Exception e){
			
		}
		
		List<FullseatviewDTO> fsvList = 
				//fsvDao.getFullSeatListByMv_codeTh_nameSr_nameShowtime(mv_code, th_name, sr_name, time);
				//fsvDao.getFullSeatListByMv_code(mv_code);
				fsvDao.getFullSeatListAll();
		
		request.setAttribute("seatfulllist", fsvList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
