package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.SeatFulllistAction;
import com.movie.controller.action.SeatPartListAction;
import com.movie.controller.action.SeatPartListByMvcodeAction;

public class SeatActionFactory {
	private static SeatActionFactory instance = new SeatActionFactory();

	public SeatActionFactory() {
		super();
	}
	
	public static SeatActionFactory getInstance(){
		return instance;
	}

	public IAction getAction(String command) {
		IAction action = null;
		System.out.println("SeatActionFactory :" + command);
		
		/*if(command.equals("seatWrite")){
			action = new SeatWriteAction();
		} else 
		*/	
		if (command.equals("seatfulllist")) {
			action = new SeatFulllistAction();
		} else if(command.equals("seatpartlist")) {
			action = new SeatPartListAction();
		} else if(command.equals("seatpartlistbymvcode")) {
			action = new SeatPartListByMvcodeAction();
		}
		return action;
	}

	
}
