package com.movie.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.dao.ShowDAO;
import com.movie.dto.ShowDTO;

public class ShowUpdateAction implements IAction {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      String url = "ShowFC?command=showviewlist";

      //////////////////////////////////////////
      ShowDTO sDTO = new ShowDTO();
      sDTO.setSH_CODE(request.getParameter("sh_code"));
      sDTO.setMV_CODE(request.getParameter("mv_code"));
      sDTO.setTH_CODE(request.getParameter("th_code"));
      sDTO.setSR_CODE(request.getParameter("sr_code"));
      String showtime = request.getParameter("showtime");
      int time = 1;
      try {
    	  time = Integer.parseInt(showtime);
      }	catch (Exception e) {
    	  time = 1;
      }
      sDTO.setShowtime(time);
      sDTO.setSH_STATUS(request.getParameter("sh_status"));

      ShowDAO sDao = ShowDAO.getInstance();
      sDao.insertShow(sDTO);
      
      RequestDispatcher dispatcher = request.getRequestDispatcher(url);
      dispatcher.forward(request, response);
   }

}
