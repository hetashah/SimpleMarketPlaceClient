package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import connection.TransactionBean;
import connection.AdvertisementBean;
import connection.ServiceProxy;

/**
 * Servlet implementation class CheckOut
 */
@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new  ServiceProxy();
	//ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
	
	//ArrayList<AdvertisementBean> arraylistitemdetail = new ArrayList<AdvertisementBean>();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		
		ArrayList<TransactionBean> arraylistbean = (ArrayList<TransactionBean>) session.getAttribute("cart");
		
		 try
		 {
		 
		 if(request.getParameter("submit2").equals("Cancel"))
			{
			 	arraylistbean.clear();
				RequestDispatcher dispatcher = request.getRequestDispatcher("simpleMarketPlaceClient_Home.jsp");
				dispatcher.forward(request, response);
			}
			else if(request.getParameter("submit2").equals("Continue"))
			{
		 
				String creditcard = request.getParameter("creditcardnumber");	
				String result="";
				
				
				if(creditcard.length()<16)
				{
					out.println("CreditCard number should be equal to 16 digit");
					
				}
				
				else
				{
				boolean flag1 = quantitycheck(arraylistbean);
				System.out.println("boolean"+flag1);
				if(flag1==false)
				{
					for(int i=0;i<arraylistbean.size();i++)
						{
							int adid,sellerid,buyerid,quantity,total;
							adid = arraylistbean.get(i).getAdid();
							sellerid = arraylistbean.get(i).getSellerid();
							buyerid = arraylistbean.get(i).getBuyerid();
							quantity = arraylistbean.get(i).getQuantity();
							total = arraylistbean.get(i).getTotal();
							result = proxy.insertTransaction(adid, sellerid, buyerid, quantity, total);
						}
					arraylistbean.clear();
					session.invalidate();
					request.getSession().setAttribute("Checkoutresult", result);
					RequestDispatcher dispatcher = request
							.getRequestDispatcher("TransactionComplete.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					//flag = false;
					arraylistbean.clear();
					System.out.println("Requested Quantity is more then Available with seller");
					response.getWriter().println("Requested Quantity is more then Available");
				}
				}
			}//elseif
		 }//try
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		//}
	}
	
	public boolean quantitycheck(ArrayList<TransactionBean> arraylistbean)
	{
		
		boolean flag=false;
		String itemname="";
		for(int i=0;i<arraylistbean.size();i++)
		{
			int quantitycheck,adidcheck;
			adidcheck = arraylistbean.get(i).getAdid();
			quantitycheck = arraylistbean.get(i).getQuantity();
			try
			{
			if(quantitycheck > proxy.getQuantityFromAdid(adidcheck))
			{
				flag=true;
				 itemname = arraylistbean.get(i).getItemname();
					break;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return flag;
	}
	

}
