package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	 @Override
	    public void init(ServletConfig config) throws ServletException {
	        System.out.println("init called");
		    super.init(config);
	        this.init();
	    }
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String pass=request.getParameter("upass");
		
		Login login=new Login();
		 login.setName(name);
		 login.setPassword(pass);
		 
		 request.getServletContext().setAttribute("user2", login);
		 
		 HttpSession session=request.getSession();
		 
		 session.setAttribute("user1", login);
		 
		 request.setAttribute("user",login);
		 
		 if(name.equals("cts") && pass.equals("1234")) {
			 
			 RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			 
			 rd.forward(request, response);
		 }else {
			 response.sendRedirect("index.jsp");
		 }
		 
		 
		
	}

}
