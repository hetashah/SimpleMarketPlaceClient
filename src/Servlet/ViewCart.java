package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import connection.AdvertisementBean;
import connection.TransactionBean;
//import connection.ServiceProxy;

/**
 * Servlet implementation class ViewCart
 */
@WebServlet("/ViewCart")
public class ViewCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
	ArrayList<AdvertisementBean> arraylistitemdetail = new ArrayList<AdvertisementBean>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("inside dogetdelete");
		HttpSession session = request.getSession();
		
		if(session==null)
		{
			response.sendRedirect("SignIn.jsp?"+"Parameter1=TimedOut");
		}
		else
		{
		
		try
		{
		String number = request.getParameter("hiddendelete");
		//System.out.println("nuumber " + number);


		 arraylistbean = (ArrayList<TransactionBean>) session.getAttribute("cart");
		
		
		arraylistbean.remove(Integer.parseInt(number));
		//arraylistitemdetail.remove(Integer.parseInt(number));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCart.jsp");
		dispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}

}
