package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(uname.equals("puranik") && pass.equals("1998"))
		{
			request.setAttribute("username", uname);
			request.setAttribute("password", pass);
			RequestDispatcher rd = request.getRequestDispatcher("SuccesServlet");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h3><font color = 'red'>invalid login</font></h3>");
		   RequestDispatcher rd = request.getRequestDispatcher("login.html");
		  
		   rd.include(request, response);
		}
		
	}

}
