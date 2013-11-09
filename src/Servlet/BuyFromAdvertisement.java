package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.AdvertisementBean;
import connection.ServiceProxy;
import connection.TransactionBean;

/**
 * Servlet implementation class BuyFromAdvertisement
 */
@WebServlet("/BuyFromAdvertisement")
public class BuyFromAdvertisement extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
	ArrayList<TransactionBean> arraylistbean = new ArrayList<TransactionBean>();
	//ArrayList<AdvertisementBean> arraylistitemdetail = new ArrayList<AdvertisementBean>();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
		int buyerid = 0;
		
		HttpSession session = request.getSession();
		
		if(session==null)
		{
			response.sendRedirect("SignIn.jsp?"+"Parameter1=TimedOut");
		}
		else
		{
		AdvertisementBean bean = (AdvertisementBean) session.getAttribute("AdvertisementDetail");
		String user = (String) session.getAttribute("user");
		boolean flag = false;
		//HttpSession sessionitem = request.getSession();
		
		try
		{
		 if(request.getParameter("Add").equals("Cancel"))
			{
			 	//arraylistbean.clear();
			 	session.removeAttribute("AdvertisementDetail");
				RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAdvertisement.jsp");
				dispatcher.forward(request, response);
			}
			else if(request.getParameter("Add").equals("Add"))
			{
				proxy.setEndpoint("http://localhost:8080/SimpleMarketPlace/services/Service?wsdl");		
				//System.out.println(user);
		
		//get data from BuyFromAdvertisement.jsp
				String itemname = bean.getItemname();
				String itemdescription = bean.getItemdesc();
				int beanadid = bean.getAdvertiseid();
				String quantity = request.getParameter("itemquantity");
				int price =  Integer.parseInt(request.getParameter("itemprice"));
				//int price = bean.getItemprice();
				int total = Integer.parseInt(quantity) * price;
		
		/*
		 new addition for checking size
		 */
				//System.out.println(beanadid);
				
				for(int i=0;i<arraylistbean.size();i++)
				{
					if(arraylistbean.get(i).getAdid() == beanadid)
					{
						flag = true;
						int existingquantity = arraylistbean.get(i).getQuantity();
						//int existingtotal = arraylistbean.get(i).getTotal();
						int newquantity = existingquantity + Integer.parseInt(quantity);
						int newtotal = newquantity * price;
						arraylistbean.get(i).setQuantity(newquantity);
						arraylistbean.get(i).setTotal(newtotal);
						System.out.println("It already contains the same advertisement");
						break;
					}//if
				}//for
		
		/*
		 * ends here
		 */
				if(!flag==true)
				{
					TransactionBean Tbean = new TransactionBean();
					buyerid = proxy.getIdFromFirstname(user);
					Tbean.setAdid(bean.getAdvertiseid());
					Tbean.setSellerid(bean.getUserid());
					Tbean.setBuyerid(buyerid);
					Tbean.setQuantity(Integer.parseInt(quantity));
					Tbean.setTotal(total);
					Tbean.setItemname(itemname);
					Tbean.setItemdescription(itemdescription);
		
					arraylistbean.add(Tbean);
				}//if
				flag = false;
				//arraylistitemdetail.add(bean);
				session.setAttribute("cart", arraylistbean);
				//session.setAttribute("itemdetail", arraylistitemdetail);
				//System.out.println(arraylistbean.size());
				//System.out.println(arraylistitemdetail.size());
				RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCart.jsp");
				dispatcher.forward(request, response);
			}
			//}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			}

}
