<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction Complete</title>
</head>
<body>



<%
	String result = (String) session.getAttribute("Checkoutresult");
	if(result.equals("true"))
	{
%>

<h4>Transaction Completed Successfully</h4>
<%
	}
	else
	{
%>
<h4>Transaction Cann't be Completed</h4>
<%
	}
%>
<br>
<br>
<a href="simpleMarketPlaceClient_Home.jsp">Home</a>
<form method="get" action="LogOut">
<input type="submit" value="LogOut"/>
</form>

</body>
</html>