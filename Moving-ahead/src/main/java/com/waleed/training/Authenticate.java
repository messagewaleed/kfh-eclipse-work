package com.waleed.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		String userName = request.getParameter("userName");
		
		if(userName.trim().equals("dalal")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("other");
			dispatcher.forward(request, response);
		}
//			response.sendRedirect("other");
		else {
			response.getWriter().println("Invalid username...");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
			
		
		
		
//		response.getWriter().println("Welcome " + userName);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
