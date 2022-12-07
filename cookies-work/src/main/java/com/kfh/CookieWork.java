package com.kfh;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWork
 */
@WebServlet("/CookieWork")
public class CookieWork extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
//		Create a Cookie
		Cookie mySampleCookie = new Cookie("user", URLEncoder.encode("KFH Great bank", "UTF-8"));
		
//		Set the expiry of the cookie
		mySampleCookie.setMaxAge(3600);
		
//		Add this cookie to the request
		response.addCookie(mySampleCookie);
		
		PrintWriter out = response.getWriter();
		
		out.println("Data saved to the cookie...");
	}
}
