package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.dao.BookDAO;
import com.movie.dao.MemberDAO;
import com.movie.dao.ShowDAO;
import com.movie.dao.ShowroomDAO;
import com.movie.dao.TheaterDAO;
import com.movie.dto.BookDTO;
import com.movie.dto.MemberDTO;
import com.movie.dto.ShowDTO;
import com.movie.dto.ShowroomDTO;
import com.movie.dto.TheaterDTO;

public class BookRequestAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "BookFC?command=booklistbyuserid";
		
		BookDTO bDTO = new BookDTO();
		
		String bk_code = request.getParameter("bk_code");
		String userid = request.getParameter("userid");
		String st_code = request.getParameter("st_code");
		String bk_date = request.getParameter("bk_date");
		String bk_status = "예약완료.";
		
		bDTO.setBk_code(bk_code);
		bDTO.setUserid(userid);
		bDTO.setSt_code(st_code);
		bDTO.setBk_date(bk_date);
		bDTO.setBk_status(bk_status);
		
		System.out.println("insert bDTO = " + bDTO);
		
		BookDAO bDAO = BookDAO.getInstance();
		int result = bDAO.insertBook(bDTO);		
		
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
