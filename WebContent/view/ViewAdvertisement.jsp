<%@page import="connection.ServiceProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="connection.AdvertisementBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Advertisement</title>
</head>
<body>
<%

ServiceProxy proxy = new ServiceProxy();
AdvertisementBean[] b = null;

proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");
b= proxy.getAdvertisementDetail();

//request.getSession().setAttribute("array", b);
if(b!=null)
{
%>


<table border="1">
	<tr>
	<td>Itemname</td>
	<td>ItemDescription</td>
	<td>Price</td>
	<td>Quantity</td>
	<td>SellerInfo</td>
	<td>Buy</td>
	</tr>

<%!
	int i;
%>
<%
	for(i=0;i<b.length;i++)
	{
%>

	<tr>
	
	<td><%=b[i].getItemname() %></td>
	<td><%=b[i].getItemdesc() %></td>
	<td><%=Integer.toString(b[i].getItemprice())%></td>
	<td><%=Integer.toString(b[i].getItemquantity()) %></td>
	<td><%=b[i].getSellerinfo() %></td>
	
	<td>
	<form action="ViewAdvertisement" method="get">
	<input id="add" type="submit" name="<%=b[i].getAdvertiseid()%>" value="Add to Cart"/><input type="hidden" name="add" value="<%=b[i].getAdvertiseid()%>" />
	</form>
	</td>
	
	</tr>
	
	<%} %>
	
</table>
<%}
else
{
	response.getWriter().print("No records");
}
%>


</body>
</html>