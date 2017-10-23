package com.movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.movie.dto.ShowDTO;
import com.movie.util.DBManager;

public class ShowDAO {
	private ShowDAO() {
		
	}
	
	private static ShowDAO instance = new ShowDAO();
	
	public static ShowDAO getInstance() {
		return instance;
	}
	
	public List <ShowDTO> getShowList() {
		List<ShowDTO> sDTOList = new ArrayList<ShowDTO>();
		
		ResultSet rs = null;
		ShowDTO sDTO = null;
		
		String sql = "select * from mv_show";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				sDTO = new ShowDTO();
				sDTO.setSH_CODE(rs.getString("sh_code"));
				sDTO.setMV_CODE(rs.getString("mv_code"));
				sDTO.setTH_CODE(rs.getString("th_code"));
				sDTO.setSR_CODE(rs.getString("sr_code"));
				sDTO.setSH_STATUS(rs.getString("sh_status"));
				
				sDTOList.add(sDTO);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return sDTOList;
		
		
		
	}
	
	//상영 정보 등록
		public void insertShow(ShowDTO sDTO) {
			String sql = "insert into mv_show values(?, ?, ?, ?, ?, ?)";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				conn = DBManager.getConnection();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sDTO.getSH_CODE());
				pstmt.setString(2, sDTO.getMV_CODE());
				pstmt.setString(3, sDTO.getTH_CODE());
				pstmt.setString(4, sDTO.getSR_CODE());
				pstmt.setInt(5, sDTO.getShowtime());
				pstmt.setString(6, sDTO.getSH_STATUS());
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
			
		}

	/*
	
	public List<ShowFullDTO> getShowFullList() {
		List<ShowFullDTO> shfDTOList = new ArrayList<ShowFullDTO>();
		
		ShowFullDTO shfDTO = new ShowFullDTO();
		
		List <ShowDTO> sDTOList = getShowList();
		
		
		
		
		return shfDTOList;
	}*/
	
	// int insertShow(ShowDTO)
	// int updateShow(ShowDTO)
	// ShowDTO getShow(영화제목, 극장, 상영관, 타임)
	// ArrayList<ShowDTO> getShowListByTitle(영화제목)
	// ArrayList<ShowDTO> getShowListAll()
	
	
	
	
}
