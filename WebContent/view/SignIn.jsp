<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>

<script type="text/javascript">

function validateform()
{
	
 	if(document.getElementById("username").value == "")
 		{
 		alert("Please Provide your name");
 		document.getElementById("errorsignin").innerHTML = '<font color="red">Please Enter Your Name*</font>';
 		document.formsignin.username.focus();
 		return false;
 		}
 	
 	if(document.getElementById("password").value != "")
 		{
 		document.getElementById("errorsignin").innerHTML = '<font color="black">Sign in</font>';
 		}
 	else
		{
 		document.getElementById("errorsignin").innerHTML = '<font color="red">Please Enter Your Password*</font>';
		alert("Please Provide your passoword");
		document.getElementById("password").focus(); 
		return false;
		}
 	
 	
 	var letters = /^[A-Za-z]+$/;  
 	if(document.getElementById("username").value.match(letters))  
 	{  
 	document.getElementById("errorsignin").innerHTML = '<font color="black">Sign in</font>';
 	return true;  
 	}  
 	else  
 	{  
 	alert('Username must have alphabet characters only');  
 	document.getElementById("errorsignin").innerHTML = '<font color="red">Name must have characters only</font>';
 	document.getElementById("username").focus();  
 	return false;  
 	}  
 	
}

</script>

</head>
<body>

<form method="post" action="SignIn" name="formsignin" onsubmit="return(validateform());">

<br>
<br>
<table>
<tr>
	<td colspan="2"><label id="errorsignin">Sign in</label></td>	
</tr>
<tr>
	<td>
	UserName:
	</td>
	<td>
		<input type="text" name="username" id="username">
	</td>
</tr>

<tr>
	<td>
	Password:
	</td>
	<td>
		<input type="password" name="password" id="password">
	</td>
</tr>

<tr>
	<td colspan="2">
		<input type="submit" name="signin" value="Sign In"/>
	</td>
</tr>

<tr>
	<td colspan="2">
		New User? <a href="SignUp.jsp">Sign Up</a>
	</td>
</tr>

</table>
</form>



</body>
</html>