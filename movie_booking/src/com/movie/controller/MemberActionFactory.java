package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.MemberJoinFormAction;
import com.movie.controller.action.MemberJoinIdCheckAction;
import com.movie.controller.action.MemberJoinIdCheckFormAction;
import com.movie.controller.action.MemberLoginFormAction;
import com.movie.controller.action.MemberLogoutAction;

public class MemberActionFactory {
	private static MemberActionFactory instance = new MemberActionFactory();
	
	private MemberActionFactory() {
		super();
	}
	
	public static MemberActionFactory getInstance() {
		return instance;
	}
	
	public IAction getAction(String command) {
		IAction action = null;
		System.out.println("MemberActionFactory : " + command);
		
		if(command.equals("login_form")) {
			action = new MemberLoginFormAction();
		} else if (command.equals("join_form")) {
			action = new MemberJoinFormAction();
		} else if (command.equals("id_check_form")) {
				action = new MemberJoinIdCheckFormAction();
		} else if (command.equals("id_check")) {
			action = new MemberJoinIdCheckAction();
		} else if (command.equals("logout")) {
			action = new MemberLogoutAction();
		}
		return action;
	}
}
