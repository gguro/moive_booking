package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;

public class MemberFindIdCheckFormAction implements IAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/idcheck.jsp";
		String email = request.getParameter("email");
		MemberDAO mDao = MemberDAO.getInstance();
		
		String userid = mDao.findID(email);
		if(userid == null || userid.equals("")) {
			request.setAttribute("userid", "userid");
			request.setAttribute("result", "-1");
		}
		else {
			request.setAttribute("userid", "userid");
			request.setAttribute("result", "1");
		}

		request.setAttribute("email", email);
		request.setAttribute("userid", userid);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
