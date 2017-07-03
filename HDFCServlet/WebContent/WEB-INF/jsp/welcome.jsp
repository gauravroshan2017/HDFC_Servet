<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<title>Welcome <% out.println(session.getAttribute("uname"));%></title>
<script>
    var secondsBeforeExpire = ${pageContext.session.maxInactiveInterval};
    var timeToDecide = 0; // Give client 15 seconds to choose.
    setTimeout(function() {
        alert('Session expired ')
    }, (secondsBeforeExpire - timeToDecide) * 1000);
    
    
    /* setTimeout(function() {
        alert('Your session is about to timeout in ' + timeToDecide + ' seconds!')
    }, (secondsBeforeExpire - timeToDecide) * 1000); */
</script>
</head>
<body>
 
 <%
  if (session == null)
  {
    %><jsp:forward page="login.jsp" /><%
  }
%>
 
	Welcome <% 
	out.println(session.getAttribute("uname"));
	%>
	
	
	 <%-- ${requestScope['user'].username}.  --%>
 
</body>
</html>