package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.movie.dto.MemberDTO;
import com.movie.util.DBManager;

public class ShowroomDAO {
	private ShowroomDAO() {
		
	}
	
	private static ShowroomDAO instance = new ShowroomDAO();
	
	public static ShowroomDAO getInstance() {
		return instance;
	}
	
	public ArrayList<String> getShowroomList() {
		int result = -1;
		ArrayList<String> srList = new ArrayList<String>();
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
	
	
	
}
