package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CharEncFilter
 */
@WebFilter("/*")
public class CharEncFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CharEncFilter() {
        // TODO Auto-generated constructor stub
    }

   /**
    * @see Filter#destroy()
    */
   public void destroy() {
      // TODO Auto-generated method stub
   }

   /**
    * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
    */
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      // TODO Auto-generated method stub
      // place your code here

      // pass the request along the filter chain
      System.out.println("필터 : 요청 파라미터 한글 인코딩");
      request.setCharacterEncoding("UTF-8");
      chain.doFilter(request, response);
      System.out.println("필터 : 응답전송");
   }

   /**
    * @see Filter#init(FilterConfig)
    */
   public void init(FilterConfig fConfig) throws ServletException {
      // TODO Auto-generated method stub
   }

}