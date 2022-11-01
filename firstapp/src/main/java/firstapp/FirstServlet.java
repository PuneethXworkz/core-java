package firstapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet { //without extends httservlet nothing will be used
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	//to read UI data we use HttpServeltRequest reference	
	//getParameter(String) will get calue from JSP to .java class
		
		String firstName = req.getParameter("firstName");//firstName is given in index.jsp as value=""
		
		String lastName = req.getParameter("lastName");//lastName is given in index.jsp as value=""
		
		System.out.println("----firstName-----"+firstName);
		System.out.println("----lastName------"+lastName);
		
		resp.getWriter().print("<h1>Welcome "+firstName+" "+lastName+" to XWORKZ</h1> ");
		
	}	
	
	/*
	 create a servelt application to store data in db
	 */
	
}
