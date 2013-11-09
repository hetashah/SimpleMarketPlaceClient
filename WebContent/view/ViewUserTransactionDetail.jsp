<%@page import="connection.ServiceProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@page import="connection.TransactionBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Transaction Detail</title>
</head>
<body>

<%
	ServiceProxy proxy = new ServiceProxy();
	TransactionBean[] transactionbeanbuyer;
	TransactionBean[] transactionBeanseller;
	int userid;
	
	String user = (String) session.getAttribute("user");
	userid = proxy.getIdFromFirstname(user);
	
	transactionbeanbuyer = proxy.getAllBuyerTransaction(userid);
	transactionBeanseller = proxy.getAllSellerTransaction(userid);
	
	
	
	if(transactionbeanbuyer!=null || transactionBeanseller!=null)
	{
%>

<h4>Items Purchased by <%=user%> </h4>

<table border="1">
	<tr>
		<td>Item name</td>
		<td>Quantity</td>
		
	</tr>	
	
	<%!
	int i;
%>
<%
	for(i=0;i<transactionbeanbuyer.length;i++)
	{
%>
	<tr>
	   <td><%=transactionbeanbuyer[i].getItemname()%></td>
	   <td><%=Integer.toString(transactionbeanbuyer[i].getQuantity())%></td>
	   
	</tr>
	<%} %>
</table>
<br>
<br>
<br>
<br>

<h4>Items Sold by <%=user%> </h4>

<table border="1">
	<tr>
		<td>Item name</td>
		<td>Quantity</td>
		
	</tr>	
	
	<%!
	int j;
%>
<%
	for(j=0;j<transactionBeanseller.length;j++)
	{
%>
	<tr>
	   <td><%=transactionBeanseller[j].getItemname()%></td>
	   <td><%=Integer.toString(transactionBeanseller[j].getQuantity())%></td>
	   
	</tr>
	<%} %>
</table>

<%
 }
 else
 {
	 response.getWriter().print("No Transaction for user recorded");
 }
%>

</body>
</html>