package com.gaurav.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserAction")
public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		RequestDispatcher rd = null;
		if(id.equals("registerUser"))
		{
			System.out.println("controls comes here");
			rd = request.getRequestDispatcher("/WEB-INF/jsp/registerUser.jsp");	
		}
		if(id.equals("loginUser"))
		{
			rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
		}
		System.out.println("insode do get method"+id);
		rd.forward(request, response);
	}


}
