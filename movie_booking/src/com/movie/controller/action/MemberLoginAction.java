package com.movie.controller.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movie.dao.MemberDAO;
import com.movie.dto.MemberDTO;

public class MemberLoginAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/member/login_fail.jsp";
		
		String userid = (String) request.getParameter("userid");
		String pwd = (String) request.getParameter("pwd");
		String usergroup = (String) request.getParameter("usergroup");
		
		System.out.println("Try login, userid=" + userid + ",pwd=" + pwd + ",usergroup=" + usergroup);
		
		MemberDAO mDAO = MemberDAO.getInstance();
		int result = mDAO.userCheck(userid, pwd, usergroup);
		
		System.out.println("userCheck = " + result);
		
		String message = "";
		if(result == 1) {
			message = "로그인 성공";
			url = "MemberFC?command=index";
			
			// 세션에 로그인 정보 저장
			HttpSession session = request.getSession();
			MemberDTO memberDTO = new MemberDTO();
			memberDTO = mDAO.getMember(userid);
			session.setAttribute("MemberDTO", memberDTO);
			
		} else if (result == 0) {
			message = "패스워드가 맞지 않습니다.";
		} else {
			message = "존재하지 않는 아이디 입니다.";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("message", message);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
