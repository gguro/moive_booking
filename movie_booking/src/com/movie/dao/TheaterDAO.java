package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.movie.dto.MemberDTO;
import com.movie.util.DBManager;

public class TheaterDAO {
	private TheaterDAO() {
		
	}
	
	private static TheaterDAO instance = new TheaterDAO();
	
	public static TheaterDAO getInstance() {
		return instance;
	}
	
	public ArrayList<String> getTheatorList() {
		int result = -1;
		ArrayList<String> thList = new ArrayList<String>();
		String theater = null;
		
		ResultSet rs = null;
		String sql = "select th_name, th_location from mv_theater";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				theater = rs.getString("th_name") + "(" + rs.getString("th_location") + ")";
				thList.add(theater);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return thList;
	}
	
	// int insertShow(ShowDTO)
	// int updateShow(ShowDTO)
	// ShowDTO getShow(영화제목, 극장, 상영관, 타임)
	// ArrayList<ShowDTO> getShowListByTitle(영화제목)
	// ArrayList<ShowDTO> getShowListAll()
	
	
	
	
}
