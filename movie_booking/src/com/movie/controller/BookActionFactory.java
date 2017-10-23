package com.movie.controller;

import com.movie.controller.action.BookConfirmFormAction;
import com.movie.controller.action.BookListAction;
import com.movie.controller.action.BookRequestAction;
import com.movie.controller.action.IAction;
import com.movie.controller.action.MovieListAction;
import com.movie.controller.action.MovieWriteAction;
import com.movie.controller.action.MovieWriteFormAction;

public class BookActionFactory {
	private static BookActionFactory instance = new BookActionFactory();
	
	public BookActionFactory() {
		super();
	}
	
	public static BookActionFactory getInstance(){
		return instance;
	} 
	
	public IAction getAction(String command) {
		IAction action = null;
		System.out.println("BookActionFactory :" + command);
		
		if(command.equals("booklist")){
			action = new BookListAction();
		} else if (command.equals("bookconfirmform")) {
			action = new BookConfirmFormAction();
		} else if (command.equals("bookrequest")) {
			action = new BookRequestAction();
		}
		return action;
	}

}
