<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%

String user = (String) session.getAttribute("user");
%>

<h2>WELCOME</h2> <%=user %>

<form>

<table border="1" cellpadding="20px">
<tr>
	<td>
	<a href="ViewUserDetails.jsp">Account Detail Info</a>
	</td>
	
	<td>
	<a href="CreateAdvertisement.jsp">Create Advertisement</a>
	</td>
	
	<td>
	<a href="ViewAdvertisement.jsp">View Advertisement</a>
	</td>
	
	<td>
	<a href="ViewUserTransactionDetail.jsp">Purchase/Sell History</a>
	</td>
	<td>
	<a href="LogOut.jsp">Log Out</a>
	</td>
</tr>
</table>

</form>

</body>
</html>