package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;
import com.movie.dto.MemberDTO;

public class MemberUpdateAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/login.jsp";
		MemberDTO mDTO = new MemberDTO();
		mDTO.setUserid(request.getParameter("userid"));
		mDTO.setPwd(request.getParameter("pwd"));
		mDTO.setEmail(request.getParameter("email"));
		mDTO.setPhone(request.getParameter("phone"));
		MemberDAO mDao = MemberDAO.getInstance();
		mDao.updateMember(mDTO);


		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
