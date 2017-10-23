package com.movie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.controller.action.IAction;

/**
 * Servlet implementation class BookFC
 */
@WebServlet("/BookFC")
public class BookFC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = request.getParameter("command");
		
		System.out.println("BookServlet" + command);
		BookActionFactory af = BookActionFactory.getInstance();
		
		// 액션컨트롤러 객체 리턴받음
		IAction action = af.getAction(command);
		if(action != null){
			//액션컨트롤러의 액션메소드 excute 호출
			action.execute(request, response);
		} else {
			System.out.println("Invalid command! command = "+ command);
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
