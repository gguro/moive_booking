package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.movie.dto.MemberDTO;
import com.movie.util.DBManager;

public class MemberDAO {
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	// 회원 추가
	public int insertMember(MemberDTO mDTO) {
		int result = -1;
		String sql = "insert into mv_member("
				+ "userid, pwd, name, email, phone, usergroup) "
				+ "values(?, ?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mDTO.getUserid());
			pstmt.setString(2, mDTO.getPwd());
			pstmt.setString(3, mDTO.getName());
			pstmt.setString(5, mDTO.getEmail());
			pstmt.setString(6, mDTO.getPhone());
			pstmt.setString(7, mDTO.getUsergroup());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
	
	public int updateMember(MemberDTO mDTO) {
		return 0;
	}
	
	public int confirmID(String userid) {
		
		ResultSet rs = null;
		int result = -1;
		String sql = "select userid from mv_member where userid = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	public MemberDTO getMember(String userid) {
		return null;
	}
	
	public int userCheck(String userid, String pwd) {
		return 0;
	}
	
	
}
