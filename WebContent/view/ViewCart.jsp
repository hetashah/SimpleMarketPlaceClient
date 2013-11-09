<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%><%@page import="connection.TransactionBean" %><%@page import="connection.AdvertisementBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
arraylistbean = (ArrayList<TransactionBean>) session.getAttribute("cart");
 if(arraylistbean!=null)
 {
%>


<table border="1">
	<tr>
	<td>Adid</td>
	<td>sellerid</td>
	<td>quantity</td>
	<td>total</td>
	<td>Delete</td>
	</tr>
<%!
	int i;
%>	

<%
	for(i=0;i<arraylistbean.size();i++)
	{
%>
<tr>
	
	<td><%=arraylistbean.get(i).getItemname() %></td>
	<td><%=arraylistbean.get(i).getItemdescription() %></td>
	<td><%=Integer.toString(arraylistbean.get(i).getQuantity()) %></td>
	<td><%=Integer.toString(arraylistbean.get(i).getTotal())%></td>
	
	<td>
	<form name="form1" action="ViewCart" method="get">
	<input type="submit" name="Delete" value="Delete"/><input type="hidden" name="hiddendelete" value="<%=i%>"/>
		</form>
	</td>
	
	</tr>
	
	<%} %>
	
</table>

<form name="form2" action="CheckOut.jsp">
	<input type ="submit" name="CheckOut" value="CheckOut">
	
	
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