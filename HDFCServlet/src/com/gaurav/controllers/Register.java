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

import com.gaurav.bean.RegisterUser;
import com.gaurav.bean.LoginUser;
import com.gaurav.dao.Authenticator;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*HttpSession session = request.getSession();*/
		RequestDispatcher rd = null;
		PrintWriter out = response.getWriter();   
		
		String username = request.getParameter("name");
		String pass = request.getParameter("pass");
		String address = request.getParameter("address");
		int pin =Integer.parseInt( request.getParameter("pin"));
	
		RegisterUser rg=new RegisterUser(username,pass,address,pin);
		
		
		Authenticator authenticator = new Authenticator();
		String result = authenticator.registerUser(rg);
		
		if (result.equals("success")) {
			
			out.print("<p style=\"color:red\">You have successfullly created account</p>");  
			rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
			rd.include(request, response);
		} else {	
			out.print("<p style=\"color:red\">User already exitss</p>");  
			rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
			rd.include(request, response);
		}
		
	}

}
