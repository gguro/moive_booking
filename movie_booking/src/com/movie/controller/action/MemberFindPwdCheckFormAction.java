package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;
import com.movie.dto.MemberDTO;

public class MemberFindPwdCheckFormAction implements IAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/find_pwd.jsp";
		String userid = request.getParameter("userid");
		MemberDAO mDao = MemberDAO.getInstance();
		
		String pwd = mDao.findPWD(userid);
		if(userid == null || userid.equals("")) {
			request.setAttribute("pwd", "pwd");
			request.setAttribute("result", "-1");
		}
		else {
			request.setAttribute("pwd", "pwd");
			request.setAttribute("result", "1");
		}

		request.setAttribute("userid", userid);
		request.setAttribute("pwd", pwd);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
