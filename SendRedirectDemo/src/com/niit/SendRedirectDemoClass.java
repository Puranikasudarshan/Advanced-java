package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SendRedirectDemoClass extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		request.setAttribute("username", uname);
        request.setAttribute("password", pass);
		
		if(uname.equals("puranik") && pass.equals("1998"))
		{
			response.sendRedirect("SuccessServlet");
			
			
			
		}
		else
		{
			response.sendRedirect("http://www.404errorpages.com");
			
		}
	}

	

}
