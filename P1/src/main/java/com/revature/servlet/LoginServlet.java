package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.AuthenticationService;

public class LoginServlet  extends HttpServlet {

	private static AuthenticationService au = new AuthenticationService();
	//privateprivat UsersDAOImpl udi = new UsersDAOImpl;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect("loginpage.html");
	}
	
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username =req.getParameter("username");
		String password =req.getParameter("password");
		
		boolean istrue=au.authenticateUser(username, password);
		
		
		System.out.println(username);
		
		if(istrue==true) {
			
			HttpSession sess =req.getSession();
			sess.setAttribute("Users", true);
			resp.sendRedirect("Employee.html");			
		}		
		else 			
			resp.sendRedirect("loginpage.html");		
		
	}
	
	
	
}