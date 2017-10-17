package com.movie.controller.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.MemberDAO;

public class MemberLogoutAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "";
		MemberDAO mDAO = MemberDAO.getInstance();
		/*
		String userid = model.get("userid");
		String pwd = model.get("pwd");
		
		int result = mDAO.userCheck(userid, pwd);
		
		System.out.println("userCheck = " + result);
		*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
