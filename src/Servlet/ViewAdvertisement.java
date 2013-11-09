package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.AdvertisementBean;
import connection.ServiceProxy;

/**
 * Servlet implementation class ViewAdvertisement
 */
@WebServlet("/ViewAdvertisement")
public class ViewAdvertisement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ServiceProxy proxy = new ServiceProxy();
	AdvertisementBean bean = new AdvertisementBean();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAdvertisement() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session==null)
		{
			response.sendRedirect("SignIn.jsp?"+"Parameter1=TimedOut");
		}
		else
		{
		
		System.out.print("Inside doget");
		int adid =1;

		try
		{
		String value = request.getParameter("add");
		System.out.print(value);
		proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");


		if(value!=null)
		{
		 adid = Integer.parseInt(value);
		 bean = proxy.getAdvertisementFromId(adid);
		 request.getSession().setAttribute("AdvertisementDetail", bean);
		// request.getSession().setAttribute("AdvertisementDetailID", adid);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("BuyFromAdvertisement.jsp");
		 dispatcher.forward(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
