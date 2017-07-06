package com.gaurav.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaurav.dao.UserDetails;

/**
 * Servlet implementation class FetchUser
 */
@WebServlet("/fetchUsersDetails")
public class FetchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FetchUser() {
       
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();  
		PrintWriter out=response.getWriter(); 
		if(session.getAttribute("uname")!=null)
		{
			UserDetails us=new UserDetails();
			us.userdetails();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
