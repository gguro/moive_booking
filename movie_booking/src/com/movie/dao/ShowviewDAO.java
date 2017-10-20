package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.ShowDTO;
import com.movie.dto.ShowviewDTO;
import com.movie.util.DBManager;

public class ShowviewDAO {
	private ShowviewDAO() {
		
	}
	
	private static ShowviewDAO instance = new ShowviewDAO();
	
	public static ShowviewDAO getInstance() {
		return instance;
	}
	
	public List <ShowviewDTO> getShowviewList() {
		List<ShowviewDTO> svDTOList = new ArrayList<ShowviewDTO>();
		
		ResultSet rs = null;
		ShowviewDTO svDTO = null;
		
		int result = -1;
		String sql = "select * from showview";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				svDTO = new ShowviewDTO();
				System.out.println(rs.getString("sh_code"));
				System.out.println(rs.getString("mv_code"));
				System.out.println(rs.getString("sr_code"));
				System.out.println(rs.getString("th_name"));
				System.out.println(rs.getString("sr_name"));
				System.out.println(rs.getInt("showtime"));
				System.out.println(rs.getString("sh_status"));
				System.out.println(("------"));
				
				svDTO.setSh_code(rs.getString("sh_code"));
				svDTO.setMv_code(rs.getString("mv_code"));
				svDTO.setSr_code(rs.getString("sr_code"));
				svDTO.setTh_name(rs.getString("th_name"));
				svDTO.setSr_name(rs.getString("sr_name"));
				svDTO.setShowtime(rs.getInt("showtime"));
				svDTO.setSh_status(rs.getString("sh_status"));
				
				svDTOList.add(svDTO);
				
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return svDTOList;
	}
	
	public ShowviewDTO getShowview(String sh_code) {
		
		ResultSet rs = null;
		ShowviewDTO svDTO = null;
		
		int result = -1;
		String sql = "select * from showview where sh_code = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sh_code);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				svDTO.setSh_code(rs.getString("sh_code"));
				svDTO.setSr_code(rs.getString("sr_code"));
				svDTO.setTh_name(rs.getString("th_name"));
				svDTO.setSr_name(rs.getString("sr_name"));
				svDTO.setShowtime(rs.getInt("showtime"));
				svDTO.setSh_status(rs.getString("sh_status"));
				
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return svDTO;
	}
	
	
	
	
	
}
