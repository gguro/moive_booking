package com.movie.controller;

import com.movie.controller.action.IAction;
import com.movie.controller.action.MovieDeleteAction;
import com.movie.controller.action.MovieDeleteFormAction;
import com.movie.controller.action.MovieDetailAction;
import com.movie.controller.action.MovieListAction;
import com.movie.controller.action.MovieUpdateAction;
import com.movie.controller.action.MovieUpdateFormAction;
import com.movie.controller.action.MovieWriteAction;
import com.movie.controller.action.MovieWriteFormAction;

public class MovieActionFactory {
	private static MovieActionFactory instance = new MovieActionFactory();

	public MovieActionFactory() {
		super();
	}
	
	public static MovieActionFactory getInstance(){
		return instance;
	}

	public IAction getAction(String command) {
		IAction action = null;
		System.out.println("MovieActionFactory :" + command);
		
		if(command.equals("movieList")){
			action = new MovieListAction();
			}  else if (command.equals("movieDetail")){
				action = new MovieDetailAction();
			}  else if (command.equals("movieWriteForm")){
				action = new MovieWriteFormAction();
			}	else if (command.equals("movieWrite")){
				action = new MovieWriteAction();
		    }	else if (command.equals("movieUpdateForm")){
				action = new MovieUpdateFormAction();
			} else if (command.equals("movieUpdate")){
				action = new MovieUpdateAction();
			} else if (command.equals("movieDeleteForm")){
				action = new MovieDeleteFormAction();
			}else if (command.equals("movieDelete")){
				action = new MovieDeleteAction();
			}
		return action;
	}

	
}
