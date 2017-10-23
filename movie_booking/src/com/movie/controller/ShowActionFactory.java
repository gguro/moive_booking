package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.ShowListAction;
import com.movie.controller.action.ShowUpdateAction;
import com.movie.controller.action.ShowUpdateFormAction;
import com.movie.controller.action.ShowviewListAction;

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
		} else if(command.equals("showupdate")) {
			action = new ShowUpdateAction();
		} else if(command.equals("getshowlist")) {
			action = new ShowListAction();
		} else if(command.equals("showviewlist")) {
			action = new ShowviewListAction();
		}
		return action;
	}
}
