package com.gaurav.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaurav.bean.RegisterUser;
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
		RequestDispatcher rd = null;
		
		HttpSession session=request.getSession();  
		PrintWriter out=response.getWriter(); 
		if(session.getAttribute("uname")!=null)
		{
			UserDetails us=new UserDetails();
			List<RegisterUser> ru=us.userdetails();
			 request.setAttribute("users",ru);
			 out.print("<p style=\"color:red\">User details are:</p>");  
			 rd = request.getRequestDispatcher("/WEB-INF/jsp/userDetails.jsp");	
			 rd.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
