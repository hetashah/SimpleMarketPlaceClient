<%@page import="connection.ServiceProxy"%>
<%@page import="connection.AdvertisementBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy</title>

<script type="text/javascript">


function checkquantity()
{
	
	
		alert("Available Number is");
		
}

</script>
</head>
<body>
<%
   AdvertisementBean bean = (AdvertisementBean) session.getAttribute("AdvertisementDetail");
   System.out.println(session);
%>

<br>
<br>

<form method="get" action="BuyFromAdvertisement" id="form1">

<table>
<tr>
	<td>
Item Name:
	</td>
	<td>
<input type="text" name="itemname" value="<%=bean.getItemname()%>"><br>
	</td>
</tr>

<tr>
	<td>
	Item Description:
	</td>
	<td>
	<input type="text" name="itemdes" value="<%=bean.getItemdesc()%>"><br>
	</td>
</tr>

<tr>
	<td>
	Item Price:
	</td>
	<td>
	<input type="text" name="itemprice" value="<%=bean.getItemprice()%>"><br>
	</td>
</tr>
<tr>
	<td>
Item Quantity:
	</td>
	<td>
<input type="text" id="itemquantity" value="1" name="itemquantity"><input type="hidden" id="hiddenitemquan" name= "hiddenitemquan" value=<%=bean.getItemquantity() %>><br>
</td>
</tr>
<tr>
<td></td>
<td></td>
</tr>

<tr>
<td>
<input type="submit" name="Add" value="Add"/>
<input id="cancel" class="button_text" type="submit" name="Add" value="Cancel">

</td>
</tr>
</table>
</form>
</body>
</html>