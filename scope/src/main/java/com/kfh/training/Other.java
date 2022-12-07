package com.kfh.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Other
 */
@WebServlet("/other")
public class Other extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			Cookie mySampleCookie = new Cookie("userData", "KFH - A Great bank");
			
//			Set the expiry of the cookie
			mySampleCookie.setMaxAge(3600);
			
//			Add this cookie to the request
			response.addCookie(mySampleCookie);
			
			PrintWriter out = response.getWriter();
			
			out.println("Data saved to the cookie...");
		
		
		
		
//		HttpSession session = request.getSession();
//		
////		Get the value out of the session object
//		String message = session.getAttribute("message").toString();
//		
//		
//		
//		response.getWriter().append("Message  : " + message);
	}



}
