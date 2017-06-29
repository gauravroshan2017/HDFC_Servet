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
        <form method="post" action="register">
        Name:<input type="text" name="name" /><br/>
        Password:<input type="password" name="pass" /><br/>
        Confirm Password:<input type="text" name="cnfPass" /><br/>
        Address <textarea name="address" cols="40" rows="5"></textarea>
        Pincode:<input type="number" name="pin" /><br/>
        <input type="submit" value="Sign Up" />
        </form>
    </body>

</html>