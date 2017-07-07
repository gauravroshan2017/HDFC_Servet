<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Detail page</title>
</head>
<body>
<% List data= (List)request.getAttribute("users");
	
	%>
<table border="1" width="303">
	<tr>
		<td width="119"><b>Fname</b></td>
		<td width="168"><b>Password</b></td>
		<td width="119"><b>Address</b></td>
		<td width="168"><b>Pin</b></td>
	</tr>
	<% out.println(data); %>
	
	<c:forEach items="${data}" var="employee">
        <tr>
            <td>Employee ID: <c:out value="${employee.fname}"/></td>
            <td>Employee Pass: <c:out value="${employee.pass}"/></td>  
            <td>Employee Address: <c:out value="${employee.address}"/></td>  
             <td>Employee Pin: <c:out value="${employee.pin}"/></td>  
        </tr>
    </c:forEach>
</table>

</body>
</html>