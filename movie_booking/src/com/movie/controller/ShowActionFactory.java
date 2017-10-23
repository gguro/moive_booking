package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.IndexAction;
import com.movie.controller.action.MemberJoinAction;
import com.movie.controller.action.MemberJoinFormAction;
import com.movie.controller.action.MemberJoinIdCheckFormAction;
import com.movie.controller.action.MemberLoginAction;
import com.movie.controller.action.MemberLoginFormAction;
import com.movie.controller.action.MemberLogoutAction;
import com.movie.controller.action.ShowUpdateFormAction;
import com.movie.controller.action.ShowviewListAction;
import com.movie.controller.action.ShowListAction;

public class ShowActionFactory {
	private static ShowActionFactory instance = new ShowActionFactory();
	
	private ShowActionFactory() {
		super();
	}
	
	public static ShowActionFactory getInstance() {
		return instance;
	}
	
	public IAction getAction(String command) {
		IAction action = null;
		System.out.println("ShowActionFactory : " + command);
		
		if(command.equals("getshowupdateform")) {
			action = new ShowUpdateFormAction();
		} else if(command.equals("getshowlist")) {
			action = new ShowListAction();
		} else if(command.equals("showviewlist")) {
			action = new ShowviewListAction();
		}
		return action;
	}
}
