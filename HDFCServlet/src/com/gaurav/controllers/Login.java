package com.gaurav.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaurav.bean.User;
import com.gaurav.dao.Authenticator;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginController")
public class Login extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher rd = null;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password);
		
		
		Authenticator authenticator = new Authenticator();
		String result = authenticator.authenticate(user);
		
		if (result.equals("success")) {
			
			session.setAttribute("uname", username);
			rd = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");		
			request.setAttribute("user", user);
		} else {		
			rd = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");		
		}
		
		rd.forward(request, response);
	
	}
	}


