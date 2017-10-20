package com.movie.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;
import com.movie.dto.MemberDTO;



public class MemberListAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/member/memberlist.jsp";
		MemberDAO mDao = MemberDAO.getInstance();
		
		List<MemberDTO> memberList = mDao.selectAllMembers();
		
		request.setAttribute("memberList", memberList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
