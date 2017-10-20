package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
	public ArrayList<MovieDTO> selectAllMovie() {
		String sql = "SELECT * FROM MV_MOVIE ORDER BY code DESC";
		ArrayList<MovieDTO> list = new ArrayList<MovieDTO>();// 영화목록
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);// 영화 행 집합

			while (rs.next()) {
				MovieDTO Hmvo = new MovieDTO();// 영화(VO)
				Hmvo.setCode(rs.getString("code"));
				Hmvo.setTitle(rs.getString("title"));
				Hmvo.setGrade(rs.getString("grade"));
				Hmvo.setDirector(rs.getString("director"));
				Hmvo.setActor(rs.getString("actor"));
				Hmvo.setSynopsis(rs.getString("synopsis"));
				Hmvo.setImage(rs.getString("MV_IMGLINK1"));
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
		String sql = "INSERT INTO MV_MOVIE VALUES(MV_MOVIE_SEQ.NEXTVAL,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getTitle());
			psmt.setString(2, Hmvo.getGrade());
			psmt.setString(3, Hmvo.getDirector());
			psmt.setString(4, Hmvo.getActor());
			psmt.setString(5, Hmvo.getSynopsis());
			psmt.setString(6, Hmvo.getImage());
			psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			DBManager.close(conn, psmt);
		}
	}

	// 영화제목으로 영화를 찾는다.
	public MovieDTO selectMovieByTitle(String code) {
		String sql = "SELECT * FROM MV_MOVIE WHERE code=?";
		MovieDTO Hmvo = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, code);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Hmvo = new MovieDTO();
				Hmvo.setCode(rs.getString("code"));
				Hmvo.setTitle(rs.getString("title"));
				Hmvo.setGrade(rs.getString("grade"));
				Hmvo.setDirector(rs.getString("director"));
				Hmvo.setActor(rs.getString("actor"));
				Hmvo.setSynopsis(rs.getString("synopsis"));
				Hmvo.setImage(rs.getString("Image"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt, rs);
		}
		return Hmvo;
	}


	// 영화코드로 영화를 찾는다.
	public MovieDTO selectMovieByCode(String code) {
		String sql = "SELECT * FROM MV_MOVIE WHERE code=?";
		MovieDTO Hmvo = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, code);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Hmvo = new MovieDTO();
				Hmvo.setCode(rs.getString("code"));
				Hmvo.setTitle(rs.getString("title"));
				Hmvo.setGrade(rs.getString("grade"));
				Hmvo.setDirector(rs.getString("director"));
				Hmvo.setActor(rs.getString("actor"));
				Hmvo.setSynopsis(rs.getString("synopsis"));
				Hmvo.setImage(rs.getString("Image"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt, rs);
		}
		return Hmvo;
	}
	
	// 영화를 삭제한다.
	public void deleteMovie(String code) {
		String sql = "DELETE FROM MV_MOVIE WHERE code=?";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, code);
			psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 영화정보를 수정한다.
	public void updateMovie(MovieDTO Hmvo) {
		String sql = "UPDATE MV_MOVIE SET title=?,grade=?,director=?,actor=?,synopsis=?, image=? WHERE code=?";
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			conn = DBManager.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Hmvo.getTitle());
			psmt.setString(2, Hmvo.getGrade());
			psmt.setString(3, Hmvo.getDirector());
			psmt.setString(4, Hmvo.getActor());
			psmt.setString(5, Hmvo.getSynopsis());
			psmt.setString(6, Hmvo.getImage());
			psmt.setString(7, Hmvo.getCode());
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, psmt);
		}
	}

}
