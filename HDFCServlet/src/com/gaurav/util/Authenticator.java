package com.gaurav.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gaurav.model.User;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Authenticator {
	 
	public String authenticate(User usr) throws IOException {
		
		String userName = usr.getUsername(); //Keeping user entered values in temporary variables.
		String password = usr.getPassword();
		System.out.println("starting point"+userName+password);
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String userNameDB = "";
		String passwordDB = "";
		try
		{
			con = DBConnection.createConnection(); //establishing connection
			
			PreparedStatement stmt = con.prepareStatement("select fname,pass from user_info where fname=? and pass=?");
			stmt.setString(1, userName);
			stmt.setString(2, password); //Statement is used to write queries. Read more about it.
			
			
			resultSet = stmt.executeQuery(); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
			
		
		
			System.out.println("resultset"+resultSet);
			while(resultSet.next()) // Until next row is present otherwise it return false
			{
				userNameDB = resultSet.getString("fname"); //fetch the values present in database
				passwordDB = resultSet.getString("pass");
				System.out.println(userNameDB+"  pass  "+passwordDB);
				if(userName.equals(userNameDB) && password.equals(passwordDB))
				{
					System.out.println("CONNECTION CLOSED"+con);
					con.close();
					System.out.println("CONNECTION CLOSEDAfter"+con);
					return "success"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
				}
			}
			con.close();
			System.out.println("CONNECTION CLOSED");
		}catch(SQLException e){
			e.printStackTrace();
		}
		return "Invalid user credentials";
		}
}