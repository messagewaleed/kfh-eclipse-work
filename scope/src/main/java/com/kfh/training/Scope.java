package com.kfh.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/work")
public class Scope extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
//		Get a reference to the session
		HttpSession theSession = request.getSession();
		
//		Get a reference to the context
		ServletContext context = request.getServletContext();
		
		
//		%temp%
		
		
		
//		Get the value out of the request
		String userName = request.getParameter("userName");
		
		if(userName != null) {
//			Save the userName to the session as well
			theSession.setAttribute("userName", userName);
			
//			Save the userName to the context as well
			context.setAttribute("userName", userName);
		}
		
//		Display the value from request
		out.println("From Request : " + userName);
		
//		Display the value from session
		out.println("<br>From Session : " + theSession.getAttribute("userName"));
		
//		Display the value from context
		out.println("<br>From Context : " + context.getAttribute("userName"));
		
		out.println("context : " + context);
		
//		theSession.invalidate();
		

		
//		Save data in the session
		
//		theSession.setAttribute("message", "Data saved...");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
