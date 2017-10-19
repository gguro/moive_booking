package com.movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.controller.action.IAction;

/**
 * Servlet implementation class MemberFC
 */
@WebServlet("/ShowFC")
public class ShowFC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// command = board_list
		String command = request.getParameter("command");
		
		System.out.println("MemberFC - cmd : " + command);
		ShowActionFactory maf = ShowActionFactory.getInstance();
		
		IAction action = maf.getAction(command);
		if(action != null){
			//액션컨트롤러의 액션메소드 execute 호출
			action.execute(request, response);
		} else {
			System.out.println("Invalid command! command = " + command);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
