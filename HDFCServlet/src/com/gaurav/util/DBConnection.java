package com.gaurav.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Properties;
public class DBConnection {
	
	
    public static Connection createConnection() throws IOException
	{
    	/*DBConnection db=new DBConnection();
    	
		
		
		Properties properties = new Properties();	
		InputStream is = db.getClass().getClassLoader().getResourceAsStream("sqlCredential.properties");
		
		properties.load(is);
		*/
	
	
		
		/*String url=(String)properties.getProperty("datasource.url");
		System.out.println("heodsd"+url);
		String us=(String)properties.getProperty("datasource.username");
		System.out.println("user name "+us);
		String password=(String)properties.getProperty("datasource.password");
		System.out.println("password is"+password);
		
		if(password.equals("password")){System.out.println("welcome gaurav");}
		*/
		Connection con = null;
		String url1 = "jdbc:mysql://localhost:3306/servlet"; //MySQL URL and followed by the database name
		String username11= "root"; //MySQL username
		String password1 = "password"; //MySQL password
		

		/**/
		try
	{
			try
			{
				Class.forName("com.mysql.jdbc.Driver"); //loading mysql driver 
			} 
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			} 
			System.out.println("before con");
				con = DriverManager.getConnection(url1, username11, password1); 
				System.out.println("before con"+con);
				//attempting to connect to MySQL database
				
	} 
	catch (Exception e) 
		{
			e.printStackTrace();
		}
			return con; 
	}
}

