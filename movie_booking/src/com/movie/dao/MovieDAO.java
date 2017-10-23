package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.MovieDTO;
import com.movie.util.DBManager;

public class MovieDAO {

	private MovieDAO() {
	}

	private static MovieDAO instance = new MovieDAO();

	// HMovieDAO 객체를 리턴한다.
	public static MovieDAO getInstance() {
		return instance;
	}

	// 영화 목록을 출력한다.
	public List<MovieDTO> selectAllMovie() {
		String sql = "SELECT * FROM MV_MOVIE ORDER BY mv_code DESC";
		List<MovieDTO> list = new ArrayList<MovieDTO>();// 영화목록
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);// 영화 행 집합

			while (rs.next()) {
				MovieDTO Hmvo = new MovieDTO();// 영화(VO)
				Hmvo.setMv_code(rs.getString("mv_code"));
				Hmvo.setMv_title(rs.getString("mv_title"));
			    Hmvo.setMv_director(rs.getString("mv_director"));
				Hmvo.setMv_cast(rs.getString("mv_cast"));
				Hmvo.setMv_imglink1(rs.getString("mv_imglink1"));
				Hmvo.setMv_synopsis(rs.getString("mv_synopsis"));
				list.add(Hmvo);// 영화목록에 영화추가
			}
		} catch (Exception e) {

		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;
	}

	// 전달인자로 받은 VO 객체를 board 테이블에 삽입한다.

	public void insertMovie(MovieDTO Hmvo) {
		String sql = "INSERT INTO MV_MOVIE VALUES(MV_MOVIE_SEQ.NEXTVAL,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getMv_title());
			psmt.setString(2, Hmvo.getMv_director());
			psmt.setString(3, Hmvo.getMv_cast());
			psmt.setString(4, Hmvo.getMv_imglink1());
			psmt.setString(5, Hmvo.getMv_synopsis());
		    psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			DBManager.close(conn, psmt);
		}
	}

	// 영화제목으로 영화를 찾는다.
	public MovieDTO selectMovieByTitle(String mv_code) {
		String sql = "SELECT * FROM MV_MOVIE WHERE mv_code=?";
		MovieDTO Hmvo = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mv_code);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Hmvo = new MovieDTO();
				Hmvo.setMv_code(rs.getString("mv_code"));
				Hmvo.setMv_title(rs.getString("mv_title"));
				Hmvo.setMv_director(rs.getString("mv_director"));
				Hmvo.setMv_cast(rs.getString("mv_cast"));
				Hmvo.setMv_imglink1(rs.getString("mv_imglink1"));
				Hmvo.setMv_synopsis(rs.getString("mv_synopsis"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt, rs);
		}
		return Hmvo;
	}


	// 영화코드로 영화를 찾는다.
	public MovieDTO selectMovieByCode(String mv_code) {
		String sql = "SELECT * FROM MV_MOVIE WHERE mv_code=?";
		MovieDTO Hmvo = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mv_code);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Hmvo = new MovieDTO();
				Hmvo.setMv_code(rs.getString("mv_code"));
				Hmvo.setMv_title(rs.getString("mv_title"));
				Hmvo.setMv_director(rs.getString("mv_director"));
				Hmvo.setMv_cast(rs.getString("mv_cast"));
				Hmvo.setMv_imglink1(rs.getString("mv_imglink1"));
				Hmvo.setMv_synopsis(rs.getString("mv_synopsis"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt, rs);
		}
		return Hmvo;
	}
	
	// 영화를 삭제한다.
	public void deleteMovie(String mv_code) {
		String sql = "DELETE FROM MV_MOVIE WHERE mv_code=?";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mv_code);
			psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 영화정보를 수정한다.
	public void updateMovie(MovieDTO Hmvo) {
		String sql = "UPDATE MV_MOVIE SET mv_title=?,mv_director=?,mv_cast=?,mv_imglink1=?,mv_synopsis=? WHERE mv_code=?";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getMv_title());
			psmt.setString(2, Hmvo.getMv_director());
			psmt.setString(3, Hmvo.getMv_cast());
			psmt.setString(4, Hmvo.getMv_imglink1());
			psmt.setString(5, Hmvo.getMv_synopsis());
			psmt.setString(6, Hmvo.getMv_code());
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt);
		}
	}

}
