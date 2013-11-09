<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.util.ArrayList"%><%@page import="connection.TransactionBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log Out</title>
</head>
<body>


<%
//HttpSession session = request.getSession();
//ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
//ArrayList<AdvertisementBean> arraylistitemdetail = new ArrayList<AdvertisementBean>();


//ArrayList<TransactionBean> arraylistbeanlog = (ArrayList<TransactionBean>) session.getAttribute("cart");
//if(!arraylistbean.isEmpty())
//{
	//System.out.println(arraylistbeanlog.size());
	//for(int i=0;i<arraylistbeanlog.size();i++)
	//{
		//System.out.println("removed" + i);	
	//arraylistbeanlog.remove(i);
	//}
//}
//session.removeAttribute("cart");

//ArrayList<TransactionBean> arraylistbeanlog = new ArrayList<TransactionBean>();

//if(null==(ArrayList<TransactionBean>) session.getAttribute("cart"))
//{
	
//}
//else
//{
//arraylistbeanlog = (ArrayList<TransactionBean>) session.getAttribute("cart");
			//arraylistbeanlog.clear();
//}
			
session.invalidate();
RequestDispatcher dispatcher = request.getRequestDispatcher("SignIn.jsp");
dispatcher.forward(request, response);

%>

<h4>Logged Out</h4>

</body>
</html>