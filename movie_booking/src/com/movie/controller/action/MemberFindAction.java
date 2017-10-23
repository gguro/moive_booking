package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.dto.MemberDTO;

public class MemberFindAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/login.jsp";
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserid(request.getParameter("userid"));
		memberDTO.setEmail(request.getParameter("email"));
		
		HttpSession session = request.getSession();
		session.setAttribute("email", request.getParameter("email"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	
		
	}

}
