package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import connection.ServiceProxy;

/**
 * Servlet implementation class CreateAdvertisement
 */
@WebServlet("/CreateAdvertisement")
public class CreateAdvertisement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServiceProxy proxy = new ServiceProxy();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAdvertisement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String itemname, itemdescription, itemprice, itemquantity, sellerinfo, username;
		int price = 0;
		int quantity = 0;
		String result;

		

		try {
			itemname = request.getParameter("itemname");
			itemdescription = request.getParameter("itemdes");
			itemprice = request.getParameter("itemprice");
			if (itemprice != null) {
				price = Integer.parseInt(itemprice);
			}
			itemquantity = request.getParameter("itemquan");
			if (itemquantity != null) {
				quantity = Integer.parseInt(itemquantity);
			}
			sellerinfo = request.getParameter("sellerinfo");
			 username = (String) request.getSession().getAttribute("user");

			proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");
			result = proxy.createAdvertisement(username, itemname,
					itemdescription, price, quantity, sellerinfo);

			if (result.equals("successfull")) {
				System.out.println("Done");
			} else {
				System.out.println(":(");
			}
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("simpleMarketPlaceClient_Home.jsp");
			dispatcher.forward(request, response);
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
