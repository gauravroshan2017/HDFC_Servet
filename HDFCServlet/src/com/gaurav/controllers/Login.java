package com.gaurav.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaurav.bean.LoginUser;
import com.gaurav.dao.Authenticator;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginController")
public class Login extends HttpServlet {
	RequestDispatcher rd = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();   
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60);

		if(session.getAttribute("uname")!=null)
		{
			System.out.println("request.getParameter('username')"+request.getParameter("username"));
				if(request.getParameter("username")!=null){
					
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					LoginUser user = new LoginUser(username, password);
					
					Authenticator authenticator = new Authenticator();
					String result = authenticator.authenticate(user);
					System.out.println("result is "+session.getAttribute("uname"));
				
				if (result.equals("success")) {
					
					session.setAttribute("uname", username);
					rd = request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");		
					request.setAttribute("user", user);
					rd.forward(request, response);
				}else{
					session.invalidate();
					out.print("<p style=\"color:red\">Sorry username or password error</p>");  
					rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
					rd.include(request, response);
				}
				}else{
					System.out.println("INSIDE ELSE");
					rd = request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");
					rd.forward(request, response);
				}
		}else if(request.getParameter("username")!=null){
			System.out.println("request.getParameter('username')"+request.getParameter("username"));
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					LoginUser user = new LoginUser(username, password);
					
					Authenticator authenticator = new Authenticator();
					String result = authenticator.authenticate(user);
					System.out.println("result is "+session.getAttribute("uname"));
				
				if (result.equals("success")) {
					
					session.setAttribute("uname", username);
					rd = request.getRequestDispatcher("/WEB-INF/jsp/welcome.jsp");		
					request.setAttribute("user", user);
					rd.forward(request, response);
				}else{
					out.print("<p style=\"color:red\">Sorry username or password error</p>");  
					rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
					rd.include(request, response);
				}
			
		}else {
			
			out.print("<p style=\"color:red\">Enter username and password.</p>");  
			rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
			rd.include(request, response);
		}
		}
	


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
}


