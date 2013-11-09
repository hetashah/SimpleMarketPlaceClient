
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.ServiceProxy;
import connection.TransactionBean;


/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
	//ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String firstname,password;
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		if(session==null)
		{
			response.sendRedirect("SignIn.jsp?"+"Parameter1=TimedOut");
		}
		else
		{
		try
		{
		firstname = request.getParameter("username");
		password = request.getParameter("password");
		
		String sessionfirstname = (String) session.getAttribute("user");
		if(!firstname.equals(sessionfirstname))
		{
			ArrayList<TransactionBean> arraylistbeanlog = new ArrayList<TransactionBean>();

			if(null==(ArrayList<TransactionBean>) session.getAttribute("cart"))
			{}
			else
			{
			arraylistbeanlog = (ArrayList<TransactionBean>) session.getAttribute("cart");
						arraylistbeanlog.clear();
			}
			session.invalidate();
		}
		
		proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");
		
		
		
		String result = proxy.signInMarket(firstname, password);
		
		if(result.equals("valid"))
		{
			String r = proxy.updatetime(firstname);
			if(r.equals("true"))
			{
				System.out.println("new time updated");
			}
			else
			{
				System.out.println(":(");
			}
			request.getSession().setAttribute("user", firstname);
			System.out.println("its valid");
			RequestDispatcher dispatcher = request.getRequestDispatcher("simpleMarketPlaceClient_Home.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("simpleMarketPlaceClient_Home.jsp");
			//out.print("Welcome to SimpleMarketPlace" + firstname);
		}
		else if(result.equals("invalid"))
		{
			out.println("Please check ur password,Try Again");
		}
		else
		{
			out.println("Please Sign Up First");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		}
	}

}
