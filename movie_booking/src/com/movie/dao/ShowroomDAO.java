package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.ShowroomDTO;
import com.movie.util.DBManager;

public class ShowroomDAO {
	private ShowroomDAO() {
		
	}
	
	private static ShowroomDAO instance = new ShowroomDAO();
	
	public static ShowroomDAO getInstance() {
		return instance;
	}
	
	public List<String> getShowroomList() {
		int result = -1;
		List<String> srList = new ArrayList<String>();
		String showroom = null;
		
		ResultSet rs = null;
		String sql = "select sr_name from mv_showroom";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				showroom = rs.getString("sr_name");
				srList.add(showroom);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return srList;
	}
	
	public ShowroomDTO getShowroomByCode(String code) {
		int result = -1;
		ShowroomDTO srDTO = null;
		
		ResultSet rs = null;
		String sql = "select * from mv_showroom";
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				srDTO = new ShowroomDTO();
				srDTO.setShowroomCapacity(rs.getInt("capacity"));
				srDTO.setShowroomCode(code);
				srDTO.setShowroomName(rs.getString("name"));
				srDTO.setTheaterCode(rs.getString("th_code"));
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return srDTO;
	}
	
		//�󿵰� ���
		public void insertshowRoom(ShowroomDTO srDTO) {
			String sql = "insert into mv_showroom values(?, ?,?,?)";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn = DBManager.getConnection();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, srDTO.getTheaterCode());
				pstmt.setString(2, srDTO.getShowroomCode());
				pstmt.setString(3, srDTO.getShowroomName());
				pstmt.setInt(4, srDTO.getShowroomCapacity());
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
			
		}
}
