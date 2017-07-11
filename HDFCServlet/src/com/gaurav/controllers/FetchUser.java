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
import com.gaurav.dataTable.DataTableParameters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
			
			
			// below code is used for data able 
			
			DataTableParameters dataTableParam = new DataTableParameters();
			dataTableParam.setAaData(ru);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
            // Convert Java Object to Json
            String json = gson.toJson(dataTableParam);
            
            System.out.println("json data os "+json);
            response.getWriter().print(json);
            
            rd = request.getRequestDispatcher("/WEB-INF/jsp/userDetailsGrid.jsp");	
			 rd.include(request, response);
			
			/* request.setAttribute("users",ru);
	
			 rd = request.getRequestDispatcher("/WEB-INF/jsp/userDetails.jsp");	
			 rd.include(request, response);*/
		}else
		{
			rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");	
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
