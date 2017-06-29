<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
	<table border=1px>
	        <form method="post" action="register">
	        <tr><td>
		        Name:</td><td> <input type="text" name="name" /><br/></td></tr>
		     <tr><td>    Password:</td><td> <input type="password" name="pass" /></td></tr>
		   <tr><td>      Confirm Password:</td><td> <input type="text" name="cnfPass" /></td></tr>
		  <tr><td>       Address </td><td> <textarea name="address" cols="40" rows="5"></textarea></td></tr>
		   <tr><td>      Pincode:</td><td> <input type="number" name="pin" /></td></tr>
		    <tr><td>     <input type="submit" value="Sign Up" /></td></tr>
	        </form>
     </table>
    </body>

</html>