package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;

public class MemberJoinIdCheckFormAction implements IAction {


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result = -1;
		String url = "/member/idcheck.jsp";
		
		// id_check
		String userid = request.getParameter("userid").trim();
		
		System.out.println("id_check_form(), id=" + userid);
		
		if(userid.length() > 0) {
			
			MemberDAO mDao = MemberDAO.getInstance();
			result = mDao.confirmID(userid);
			
			System.out.println("id_check_form() result = " + result);
		} 
		
		request.setAttribute("userid", userid);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
