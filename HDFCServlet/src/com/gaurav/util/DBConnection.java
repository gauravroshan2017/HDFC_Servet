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
    	DBConnection db=new DBConnection();

		Properties properties = new Properties();	
		InputStream is = db.getClass().getClassLoader().getResourceAsStream("sqlCredential.properties");
		
		properties.load(is);
		
		String url=(String)properties.getProperty("datasource.url");		
		String us=(String)properties.getProperty("datasource.username");	
		String password=(String)properties.getProperty("datasource.password");
		
		Connection con = null;
			
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
			//attempting to connect to MySQL database
			
				con = DriverManager.getConnection(url,us,password); 							
				
	} 
	catch (Exception e) 
		{
			e.printStackTrace();
		}
			return con; 
	}
}

