package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.dao.MemberDAO;
import com.movie.dto.MemberDTO;

public class MemberJoinAction implements IAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/login.jsp";
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setUserid(request.getParameter("userid"));
		memberDTO.setPwd(request.getParameter("pwd"));
		memberDTO.setName(request.getParameter("name"));
		memberDTO.setEmail(request.getParameter("email"));
		memberDTO.setPhone(request.getParameter("phone"));
		memberDTO.setUsergroup(request.getParameter("usergroup"));
		
		HttpSession session = request.getSession();
		session.setAttribute("userid", request.getParameter("userid"));
		
		MemberDAO mDao = MemberDAO.getInstance();
		mDao.insertMember(memberDTO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
