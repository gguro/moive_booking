package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.MovieDeleteAction;
import com.movie.controller.action.MovieDetailAction;
import com.movie.controller.action.MovieListAction;
import com.movie.controller.action.MovieUpdateAction;
import com.movie.controller.action.MovieUpdateFormAction;
import com.movie.controller.action.MovieWriteAction;
import com.movie.controller.action.MovieWriteFormAction;
import com.movie.controller.action.SeatWriteAction;

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
		
		if(command.equals("seatWrite")){
			action = new SeatWriteAction();
			} 
		return action;
	}

	
}
