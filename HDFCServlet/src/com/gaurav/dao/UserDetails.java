package com.gaurav.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gaurav.bean.LoginUser;
import com.gaurav.bean.RegisterUser;
import com.gaurav.util.DBConnection;

public class UserDetails {

	public List<LoginUser> userdetails(LoginUser usr) throws IOException {
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	List<LoginUser> lu = new ArrayList();
	try
	{
		con = DBConnection.createConnection();
		Statement s = con.createStatement();
		s.executeQuery ("select * from user_info");
		resultSet = s.getResultSet();
		 
                          
        
                      
         /* Printing column names */
         
         while(resultSet.next())
         {
        	 RegisterUser ru=new RegisterUser();
         }
		
		
		
		
		con.close();
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	return lu;
	}
}
