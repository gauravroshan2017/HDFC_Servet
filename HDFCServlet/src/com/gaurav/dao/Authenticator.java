package com.gaurav.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gaurav.bean.LoginUser;
import com.gaurav.bean.RegisterUser;
import com.gaurav.util.DBConnection;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Authenticator {
	 
	public String authenticate(LoginUser usr) throws IOException {
		
		String userName = usr.getUsername(); //Keeping user entered values in temporary variables.
		String password = usr.getPassword();
		
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
			
			while(resultSet.next()) // Until next row is present otherwise it return false
			{
				userNameDB = resultSet.getString("fname"); //fetch the values present in database
				passwordDB = resultSet.getString("pass");
			
				if(userName.equals(userNameDB) && password.equals(passwordDB))
				{
				
					con.close();
					
					return "success"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
				}
			}
			con.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return "Invalid user credentials";
		}
	/* Register a user*/
		public String registerUser(RegisterUser rgu) throws IOException {
		
		String userName = rgu.getFname();
		String password = rgu.getPassword();
		String address = rgu.getAddress();
		int pin = rgu.getPin();
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			con = DBConnection.createConnection(); //establishing connection
			
			PreparedStatement stmt = con.prepareStatement("insert into user_info(fname,pass,address,pin) values (?,?,?,?)");
			stmt.setString(1, userName);
			stmt.setString(2, password);
			stmt.setString(3, address);
			stmt.setInt(4, pin);
			System.out.println("control coe here Authenticator");
			//Statement is used to write queries. Read more about it.
			
			
			int i= stmt.executeUpdate();
			con.close();
			System.out.println("control coe here Authenticator"+i);
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "success"; 
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
				return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
			}
			
	

	
}