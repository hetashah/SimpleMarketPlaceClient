<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Advertisement</title>

<script type="text/javascript">

function validateform()
{
	 var numbers = /^[0-9]+$/;
		if(document.getElementById("item").value == "")
			{
			//alert("Please Provide Item name");
			document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">Please Enter item name</font>';
			document.getElementById("item").focus();  
			return false;
			}
		
			if(document.getElementById("itemdescription").value == "")
		{
		//alert("Please Provide Itemdescription");
		document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">Please Enter Itemdescription</font>';
		document.getElementById("itemdescription").focus();  
		return false;
		}
		
		 if(document.getElementById("price").value == "")
		{
		//alert("Please Provide Price");
		document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">Please Enter Price</font>';
		document.getElementById("price").focus();  
		return false;
		}
		
		 if(document.getElementById("quantity").value == "")
		{
		//alert("Please Provide quantity");
		document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">Please Enter quantity</font>';
		document.getElementById("quantity").focus();  
		return false;
		}
		
		if(document.getElementById("price").value.match(numbers))
			 {
			document.getElementById("errorlabeladvertise").innerHTML = '<font color="black">Create Advertisement</font>';
			
			 }
			 else 
				 {
				 alert('price must be numbers only');  
				 	document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">price must be numbers only</font>';
				 	document.getElementById("price").focus();  
				 	return false;  
				 }
		
		if(document.getElementById("quantity").value.match(numbers))
		 {
		document.getElementById("errorlabeladvertise").innerHTML = '<font color="black">Create Advertisement</font>';
		return true;
		 }
		 else 
			 {
			 alert('quantity must be numbers only');  
			 	document.getElementById("errorlabeladvertise").innerHTML = '<font color="red">quantity must be numbers only</font>';
			 	document.getElementById("quantity").focus();  
			 	return false;  
			 }
			
}

</script>

</head>
<body>

<form method="post" name="createadvertise" action="CreateAdvertisement" onsubmit="return(validateform());">
<h4>Create Advertisement</h4>

<br>

<table>
	
	<tr>
	<td colspan="2"><label id=errorlabeladvertise>Create Advertisement</label>
	</tr>
	
	<tr>
		<td>
		ItemName:
		</td>
		
		<td>
		<input type="text" name="itemname" id="item">
		</td>
	</tr>
	
	<tr>
		<td>
		ItemDescription:
		</td>
		
		<td>
		<textarea rows="2" cols="15" name="itemdes" id="itemdescription"></textarea>
		</td>
	</tr>
	
	<tr>
		<td>
		ItemPrice:
		</td>
		
		<td>
		<input type="text" name="itemprice" id="price">
		</td>
	</tr>
	
	<tr>
		<td>
		ItemQuantity:
		</td>
		
		<td>
		<input type="text" name="itemquan" id="quantity">
		</td>
	</tr>

	
	
	<tr>
		<td>
		SellerInfo:
		</td>
		
		<td>
		<textarea rows="4" cols="15" name="sellerinfo" ></textarea>
		</td>
	</tr>
	
	<tr>
		<td>
		<input type="submit" name="create" value="Create">
		</td>
		
		<td>
		<input type="button" name="cancel" value="Cancel" onclick="location.href='simpleMarketPlaceClient_Home.jsp'">
		</td>
	</tr>		

</table>

</form>

</body>
</html>