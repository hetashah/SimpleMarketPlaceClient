<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up for new user</title>

<script type="text/javascript">

function validateform()
{
	
		if(document.getElementById("firstname").value == "")
			{
			alert("Please Provide your First name");
			document.getElementById("errorlabel").innerHTML = '<font color="red">Please Enter Your First name</font>';
			return false;
			}
		
		else	if(document.getElementById("lastname").value == "")
		{
		alert("Please Provide your Last name");
		document.getElementById("errorlabel").innerHTML = '<font color="red">Please Enter Your Last name</font>';
		return false;
		}
		
		else if(document.getElementById("emailadd").value == "")
		{
		alert("Please Provide your email name");
		document.getElementById("errorlabel").innerHTML = '<font color="red">Please Enter Your email Address</font>';
		return false;
		}
		
		else if(document.getElementById("password").value == "")
		{
		alert("Please Provide your password name");
		document.getElementById("errorlabel").innerHTML = '<font color="red">Please Enter Your Password</font>';
		return false;
		}
		else
			{
			document.getElementById("errorlabel").innerHTML = '<font color="black">Welcome To Sign up</font>';
			return true;
			}
}

</script>

</head>
<body>

<form method="post" name="formsignup" action="SignUp" onsubmit="return(validateform());">

<br>
Sign Up
<p style="font-size: 12px">For Buying and Selling Items</p>


<br>
<br>

<table>

<tr>
	<td colspan="2"><label id=errorlabel>Welcome To Sign up</label>
</tr>
<tr>
	<td>FirstName:</td>
	<td> <input type="text" name="fname" id="firstname"> </td>
</tr>

<tr>
	<td>LastName:</td>
	<td><input type="text" name="lname" id="lastname"></td>
</tr>

<tr>
	<td>Email:</td>
	<td><input type="text" name="email" id="emailadd"></td>
</tr>

<tr>
	<td>Password:</td>
	<td><input type="password" name="pass" id="password"></td>
</tr>

<tr>
	<td><input type="submit" name="submit0" value="Sign Up"></td>
	<td><input type="button" name="Cancel" value="Cancel" onclick="location.href='SignIn.jsp'"></td>
</tr>

</table>

</form>

</body>
</html>