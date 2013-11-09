<%@page import="connection.UserMarket"%>
<%@page import="connection.ServiceProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>

<%
ServiceProxy proxy = new ServiceProxy();
UserMarket user = new UserMarket();
String username = (String) session.getAttribute("user");

proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");

user = proxy.getuserDetailMarket(username);

if(user!=null)
{
%>

<form>
<br>
<br>
<br>
<table>
	<tr>
		<td>FisrtName:</td>
		<td><input type="text" name="firstname" readonly="readonly" value=<%=user.getFirstname()%>></td>
	</tr>
	<tr>
		<td>LastName:</td>
		<td><input type="text" name="lastname" readonly="readonly" value=<%=user.getLastname() %>></td>
	</tr>
	<tr>
		<td>Email Address:</td>
		<td><input type="text" name="email" readonly="readonly" value=<%=user.getEmail() %>></td>
	</tr>
	<tr>
		<td>LastLoggedIn Time</td>
		<td><input type="text" name="lastloggedintime" readonly="readonly" value=<%=user.getLastlogtime() %>></td>
	</tr>
	

</table>


</form>

<%
 }
 else
 {
	 response.getWriter().print("No Records");
 }
%>

</body>
</html>