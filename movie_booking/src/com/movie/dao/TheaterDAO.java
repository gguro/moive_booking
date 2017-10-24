package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.TheaterDTO;
import com.movie.util.DBManager;

public class TheaterDAO {
	private TheaterDAO() {
		
	}
	
	private static TheaterDAO instance = new TheaterDAO();
	
	public static TheaterDAO getInstance() {
		return instance;
	}
	
	public List<String> getTheatorList() {
		int result = -1;
		List<String> thList = new ArrayList<String>();
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
	
	public TheaterDTO getTheatterByCode(String code) {
//		private String theaterCode;
//		private String theaterName;
//		private String theaterLocation;
		
		int result = -1;
		TheaterDTO thDTO = null;
		
		ResultSet rs = null;
		String sql = "select * from mv_theater";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				thDTO = new TheaterDTO();
				thDTO.setTheaterCode(code);
				thDTO.setTheaterLocation(rs.getString("location"));
				thDTO.setTheaterName(rs.getString("name"));
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return thDTO;
	}

	//���� ���
	public void insertTheater(TheaterDTO tDTO) {
		String sql = "insert into mv_theater values(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tDTO.getTheaterCode());
			pstmt.setString(2, tDTO.getTheaterName());
			pstmt.setString(3, tDTO.getTheaterLocation());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	
	
}
