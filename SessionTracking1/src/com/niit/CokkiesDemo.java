package com.niit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/*By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. 
 * So cookie is stored in the cache of the browser. 
 * After that if request is sent by the user, cookie is added with request by default.
 * we are storing the name of the user in the cookie object and accessing it in another servlet.*/

public class CokkiesDemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();		
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(name.equals("puranik")&& pass.equals("1998"))
		{
			Cookie ck = new Cookie("username",name);
			response.addCookie(ck);
			ck.setMaxAge(60*60*2);
			
			out.println("<form action = 'SuccessServlet' method = 'post'>");
			out.println("<input type = 'submit' value = 'go'>");
			out.println("</form>");
		}
		
		else
		{
           response.sendRedirect("http://www.404errorpages.com");			
		}
	}


}
