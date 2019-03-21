package com.niit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/*In case of Hidden Form Field a hidden (invisible) textfield is used for maintaining the state of an user.*/
public class HiddenFormFieldDemo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String pass =request.getParameter("password");
		
		if(name.equals("puranik")&&pass.equals("1998"))
		{
			out.println("<form action = 'SuccessServlet'>");
			out.println("<input type = 'hidden' name = 'username' value ="+name+">");
			out.println("<input type = 'submit' value = 'go'>");
			out.println("</form>");
			out.close();
		
		}
		
		
		
		
	}

	

}
