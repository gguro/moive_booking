package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.movie.dto.MemberDTO;
import com.movie.util.DBManager;

public class ShowDAO {
	private ShowDAO() {
		
	}
	
	private static ShowDAO instance = new ShowDAO();
	
	public static ShowDAO getInstance() {
		return instance;
	}
	
	
	
	// insert ShowDAO
	
	
	
	// update
	// ShowDTO getshow(영화제목, 극장, 상영관, 타임)
	// ArrayList<ShowDTO> getShow(영화제목)
	// ArrayList<ShowDTO> getallshow
	
	
	
}
