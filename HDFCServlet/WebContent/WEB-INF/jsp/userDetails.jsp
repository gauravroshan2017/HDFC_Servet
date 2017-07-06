<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page language="java" import="java.util.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Detail page</title>
</head>
<body>
<table border="1" width="303">
	<tr>
		<td width="119"><b>ID</b></td>
		<td width="168"><b>Message</b></td>
	</tr>
	<%Iterator itr;%>
	<% List data= (List)request.getAttribute("users");
	for (itr=data.iterator(); itr.hasNext(); )
	{
	%>
	<tr>
		<td width="119"><%=itr.next()%></td>
		<td width="168"><%=itr.next()%></td>
		<td width="119"><%=itr.next()%></td>
		<td width="168"><%=itr.next()%></td>
		
	</tr>
	<%}%>
</table>
</body>
</html>