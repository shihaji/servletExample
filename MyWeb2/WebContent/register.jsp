<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.cts.Login" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Login login =(Login) application.getAttribute("user2"); %>
 <h3> Welcome <%=login.getName() %></h3>

  <h4>Register Employee</h4>
</body>
</html>