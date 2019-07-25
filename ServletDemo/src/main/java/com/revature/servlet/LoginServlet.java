package com.revature.servlet;

import java.io.IOException;

public class LoginServlet extends HttpServlet{
		
		//doGet: this method will handle all GET requests made to this servlet
		
		protected void doGet(HttpServletRequest req, HttpServletREsponse resp) throws ServletException, IOException{
			//write a message to the response body with PrintWriter
			//resp.getWriter().write("hello from Login Servlet!");
			
			//serv the Login.html page as the response
			req.getRequestDispatcher("Login.html").forward(req,resp);
		}
	}

}
 