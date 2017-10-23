package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.BookDTO;
import com.movie.util.DBManager;

public class BookDAO {

	private BookDAO() {
		
	}
	
	private static BookDAO instance = new BookDAO();
	
	public static BookDAO getInstance() {
		return instance;
	}

	public List<BookDTO> selectAllBook(){
		String sql = "SELECT * FROM MV_BOOK ORDER BY bk_code DESC";
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);// 영화 행 집합

			while (rs.next()) {
				BookDTO Hmvo = new BookDTO();// 영화(VO)
				Hmvo.setBk_code(rs.getString("bk_code"));
				Hmvo.setUserid(rs.getString("userid"));
			    Hmvo.setSt_code(rs.getString("st_code"));
				Hmvo.setBk_date(rs.getString("bk_date"));
				Hmvo.setBk_status(rs.getString("bk_status"));
				list.add(Hmvo);// 영화목록에 영화추가
			}
		} catch (Exception e) {

		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}
	
	
	public List<BookDTO> selectUserBook(String userid){
		String sql = "select * from mv_book where userid=?";
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("x");
				
				BookDTO Hmvo = new BookDTO();// 영화(VO)
				Hmvo.setBk_code(rs.getString("bk_code"));
				Hmvo.setUserid(rs.getString("userid"));
			    Hmvo.setSt_code(rs.getString("st_code"));
				Hmvo.setBk_date(rs.getString("bk_date"));
				Hmvo.setBk_status(rs.getString("bk_status"));
				list.add(Hmvo);// 영화목록에 영화추가
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public int insertBook(BookDTO Hmvo) {
		String sql = "INSERT INTO MV_BOOK VALUES(?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getBk_code());
			psmt.setString(2, Hmvo.getUserid());
			psmt.setString(3, Hmvo.getSt_code());
			psmt.setString(4, Hmvo.getBk_date());
			psmt.setString(5, Hmvo.getBk_status());
		    psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		} finally {
			DBManager.close(conn, psmt);
		}
		
		return 1;
	}
	
	
	
}

