package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

import connection.ServiceProxy;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
//		try
//		{
		
		if(session==null)
		{
			response.sendRedirect("SignIn.jsp?"+"Parameter1=TimedOut");
		}
		else
		{
			
			String firstname,lastname,emailid,password,marketResult,SignInresult;
			PrintWriter out = response.getWriter();
		
		try
		{
			firstname = request.getParameter("fname");
			lastname = request.getParameter("lname");
			emailid = request.getParameter("email");
			password = request.getParameter("pass");
			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");
			marketResult = proxy.signUpMarket(firstname, lastname, emailid, password);
		
			if(marketResult.equals("true"))
			{
				SignInresult = proxy.signInMarket(firstname, password);
				if(SignInresult.equals("valid"))
				{
					request.getSession().setAttribute("user", firstname);
					RequestDispatcher dispatcher = request.getRequestDispatcher("simpleMarketPlaceClient_Home.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					out.println("Try again with Sign In" + firstname);
				}
				//out.println("welcome" + firstname);
			}
			else
			{
				out.println("Login again");
			}
			}//try
			catch(Exception ex)
				{
				ex.printStackTrace();
				}
			}//elseif
		
	}
	

}
