package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.SeatDTO;
import com.movie.util.DBManager;

public class SeatDAO {
	private SeatDAO() {
		
	}
	
	private static SeatDAO instance = new SeatDAO();
	
	public static SeatDAO getInstance() {
		return instance;
	}
	
	public List<SeatDTO> getSeatListByShCode(String sh_code) {
		
		List<SeatDTO> stList = new ArrayList<SeatDTO>(); 
		
		ResultSet rs = null;
		String sql = "select * from mv_seat where sh_code=?";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sh_code);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SeatDTO stDTO = new SeatDTO();
				stDTO.setSh_code(sh_code);
				stDTO.setSt_code(rs.getString("st_code"));
				stDTO.setSt_col(rs.getString("st_col"));
				stDTO.setSt_row(rs.getInt("st_row"));
				stDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				stList.add(stDTO);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return stList;
	}
	
	public int getSeatUseyn(String sh_code, String st_code) {
		int result = -1;
		
		ResultSet rs = null;
		String sql = "select st_useyn from mv_seat where sh_code=? and st_code=?";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sh_code);
			pstmt.setString(2, sh_code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("st_useyn");
			} else {
				result = -1;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
	
	public void SeatWriteAction(SeatDTO Hmvo) {
		String sql = "INSERT INTO MV_SEAT VALUES(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getSt_code());
			psmt.setString(2, Hmvo.getSh_code());
			psmt.setString(3, Hmvo.getSt_col());
			psmt.setInt(4, Hmvo.getSt_row());
			psmt.setInt(5, Hmvo.getSt_useyn());
		    psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			DBManager.close(conn, psmt);
		}
	}
}
