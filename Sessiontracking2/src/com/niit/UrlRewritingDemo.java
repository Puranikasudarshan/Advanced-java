package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*In URL rewriting, we append a token or identifier to the URL of the next Servlet or the next resource. 
 * We can send parameter name/value pairs using the following format:
*  url?name1=value1&name2=value2&??*/

public class UrlRewritingDemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(name.equals("puranik")&& pass.equals("1998"))
		{
	       out.print("<a href='SuccessServlet?username="+name+"'>visit</a>");
		}
		else
		{
			response.sendRedirect("http://www.404errorpages.com");
		}
		
		
	}

	

}
