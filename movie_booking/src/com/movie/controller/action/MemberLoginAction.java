package com.movie.controller.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;

public class MemberLoginAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MemberDAO mDAO = MemberDAO.getInstance();
		String url = "member/login.jsp";
		
		String userid = (String) request.getAttribute("userid");
		String pwd = (String) request.getAttribute("pwd");
		
		int result = mDAO.userCheck(userid, pwd);
		
		System.out.println("userCheck = " + result);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
