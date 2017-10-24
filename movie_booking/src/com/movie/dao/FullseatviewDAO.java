package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.FullseatviewDTO;
import com.movie.util.DBManager;

public class FullseatviewDAO {
	private FullseatviewDAO() {
		
	}
	
	private static FullseatviewDAO instance = new FullseatviewDAO();
	
	public static FullseatviewDAO getInstance() {
		return instance;
	}
	
	
	public List <FullseatviewDTO> getFullSeatListAll() {
		List<FullseatviewDTO> fsvDTOList = new ArrayList<FullseatviewDTO>();
		
		ResultSet rs = null;
		FullseatviewDTO fsvDTO = null;
		
		int result = -1;
		String sql = "select * from fullseatview";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				fsvDTO = new FullseatviewDTO();
				fsvDTO.setSh_code(rs.getString("sh_code"));
				fsvDTO.setMv_code(rs.getString("mv_code"));
				fsvDTO.setSr_code(rs.getString("sr_code"));
				fsvDTO.setTh_name(rs.getString("th_name"));
				fsvDTO.setSr_name(rs.getString("sr_name"));
				fsvDTO.setShowtime(rs.getInt("showtime"));
				fsvDTO.setLocaltime(rs.getString("localtime"));
				fsvDTO.setSh_status(rs.getString("sh_status"));
				fsvDTO.setSt_code(rs.getString("st_code"));
				fsvDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				fsvDTOList.add(fsvDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return fsvDTOList;
	}
	
	

	public List <FullseatviewDTO> getFullSeatListByMv_code(String mv_code) {
		List<FullseatviewDTO> fsvDTOList = new ArrayList<FullseatviewDTO>();
		
		ResultSet rs = null;
		FullseatviewDTO fsvDTO = null;
		
		int result = -1;
		String sql = "select * from fullseatview where mv_code=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv_code);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				fsvDTO = new FullseatviewDTO();
				fsvDTO.setSh_code(rs.getString("sh_code"));
				fsvDTO.setMv_code(rs.getString("mv_code"));
				fsvDTO.setSr_code(rs.getString("sr_code"));
				fsvDTO.setTh_name(rs.getString("th_name"));
				fsvDTO.setSr_name(rs.getString("sr_name"));
				fsvDTO.setShowtime(rs.getInt("showtime"));
				fsvDTO.setLocaltime(rs.getString("localtime"));
				fsvDTO.setSh_status(rs.getString("sh_status"));
				fsvDTO.setSt_code(rs.getString("st_code"));
				fsvDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				fsvDTOList.add(fsvDTO);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return fsvDTOList;
	}
	
	public List <FullseatviewDTO> getFullSeatListByMv_codeTh_code(String mv_code, String th_name) {
		List<FullseatviewDTO> fsvDTOList = new ArrayList<FullseatviewDTO>();
		
		ResultSet rs = null;
		FullseatviewDTO fsvDTO = null;
		
		int result = -1;
		String sql = "select * from fullseatview where mv_code=? and th_name=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv_code);
			pstmt.setString(2, th_name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				fsvDTO = new FullseatviewDTO();
				fsvDTO.setSh_code(rs.getString("sh_code"));
				fsvDTO.setMv_code(rs.getString("mv_code"));
				fsvDTO.setSr_code(rs.getString("sr_code"));
				fsvDTO.setTh_name(rs.getString("th_name"));
				fsvDTO.setSr_name(rs.getString("sr_name"));
				fsvDTO.setShowtime(rs.getInt("showtime"));
				fsvDTO.setLocaltime(rs.getString("localtime"));
				fsvDTO.setSh_status(rs.getString("sh_status"));
				fsvDTO.setSt_code(rs.getString("st_code"));
				fsvDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				fsvDTOList.add(fsvDTO);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return fsvDTOList;
	}
	
	public List <FullseatviewDTO> getFullSeatListByMv_codeTh_nameSr_name(String mv_code, String th_name, String sr_name) {
		List<FullseatviewDTO> fsvDTOList = new ArrayList<FullseatviewDTO>();
		
		ResultSet rs = null;
		FullseatviewDTO fsvDTO = null;
		
		int result = -1;
		String sql = "select * from fullseatview where mv_code=? and th_name=? and sr_name=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv_code);
			pstmt.setString(2, th_name);
			pstmt.setString(3, sr_name);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				fsvDTO = new FullseatviewDTO();
				fsvDTO.setSh_code(rs.getString("sh_code"));
				fsvDTO.setMv_code(rs.getString("mv_code"));
				fsvDTO.setSr_code(rs.getString("sr_code"));
				fsvDTO.setTh_name(rs.getString("th_name"));
				fsvDTO.setSr_name(rs.getString("sr_name"));
				fsvDTO.setShowtime(rs.getInt("showtime"));
				fsvDTO.setLocaltime(rs.getString("localtime"));
				fsvDTO.setSh_status(rs.getString("sh_status"));
				fsvDTO.setSt_code(rs.getString("st_code"));
				fsvDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				fsvDTOList.add(fsvDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return fsvDTOList;
	}
	
	public List <FullseatviewDTO> getFullSeatListByMv_codeTh_nameSr_nameShowtime(String mv_code, String th_name, String sr_name, int showtime) {
		List<FullseatviewDTO> fsvDTOList = new ArrayList<FullseatviewDTO>();
		
		ResultSet rs = null;
		FullseatviewDTO fsvDTO = null;
		
		int result = -1;
		String sql = "select * from fullseatview where mv_code=? and th_name=? and sr_name=? and showtime=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mv_code);
			pstmt.setString(2, th_name);
			pstmt.setString(3, sr_name);
			pstmt.setInt(4, showtime);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				fsvDTO = new FullseatviewDTO();
				fsvDTO.setSh_code(rs.getString("sh_code"));
				fsvDTO.setMv_code(rs.getString("mv_code"));
				fsvDTO.setSr_code(rs.getString("sr_code"));
				fsvDTO.setTh_name(rs.getString("th_name"));
				fsvDTO.setSr_name(rs.getString("sr_name"));
				fsvDTO.setShowtime(rs.getInt("showtime"));
				fsvDTO.setLocaltime(rs.getString("localtime"));
				fsvDTO.setSh_status(rs.getString("sh_status"));
				fsvDTO.setSt_code(rs.getString("st_code"));
				fsvDTO.setSt_useyn(rs.getInt("st_useyn"));
				
				fsvDTOList.add(fsvDTO);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return fsvDTOList;
	}
}
