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
 
 <% Login login =(Login) request.getAttribute("user"); %>
 <h3> Welcome <%=login.getName() %></h3>
 <br><a href="home">go to register page</a>
</body>
</html>