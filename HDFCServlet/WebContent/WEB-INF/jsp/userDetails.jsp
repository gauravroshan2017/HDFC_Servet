<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Detail page</title>
<jsp:include page="logout.jsp" />
</head>
<body>
 
<table border="1" width="303">
	<tr>
		<td width="119"><b>Fname</b></td>
		<td width="168"><b>Password</b></td>
		<td width="119"><b>Address</b></td>
		<td width="168"><b>Pin</b></td>
	</tr>
	
	

	<c:forEach var="user" items="${users}">
        <tr>
            <td><c:out value="${user.fname}"/></td>
            <td> <c:out value="${user.password}"/></td>  
            <td> <c:out value="${user.address}"/></td>  
             <td> <c:out value="${user.pin}"/></td>  
        </tr>
    </c:forEach>
</table>

</body>
</html>