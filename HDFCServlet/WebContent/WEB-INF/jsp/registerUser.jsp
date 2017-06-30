<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btnSubmit").click(function () {
            var password = $("#txtPassword").val();
            var confirmPassword = $("#txtConfirmPassword").val();
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        });
    });
</script>
</head>
	<body>
	
	<table border=1px>
	        <form method="post" action="register">
	        <tr><td>
		        Name:</td><td> <input type="text" name="name" required="" oninput="setCustomValidity('')" oninvalid="this.setCustomValidity('Please Enter  Name')"/><br/></td></tr>
		     <tr><td>    Password:</td><td> <input id="txtPassword" type="password" name="pass" required="" oninput="setCustomValidity('')" oninvalid="this.setCustomValidity('Please Enter  password')"/></td></tr>
		   <tr><td>      Confirm Password:</td><td> <input id="txtConfirmPassword" type="text" name="cnfPass" required="" oninput="setCustomValidity('')" oninvalid="this.setCustomValidity('Please reconfirm  password')"/></td></tr>
		  <tr><td>       Address </td><td> <textarea name="address" cols="40" rows="5"></textarea></td></tr>
		   <tr><td>      Pincode:</td><td> <input type="number" name="pin" /></td></tr>
		    <tr><td>     <input id="btnSubmit" type="submit" value="Sign Up" /></td></tr>
	        </form>
     </table>
    </body>

</html>