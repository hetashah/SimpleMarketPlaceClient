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

import connection.TransactionBean;



/**
 * Servlet implementation class LogOut
 */
@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		/*ArrayList<TransactionBean> arraylistbeanlog = new ArrayList<TransactionBean>();*/
//	    arraylistbeanlog = (ArrayList<TransactionBean>) session.getAttribute("cart");
//		arraylistbeanlog.clear();
		/*if(null==(ArrayList<TransactionBean>) session.getAttribute("cart"))
		{
			
		}
		else
		{
		arraylistbeanlog = (ArrayList<TransactionBean>) session.getAttribute("cart");
		arraylistbeanlog.clear();
		}*/
		
		session.invalidate();
		response.getWriter().println("User logged out successfully");
		System.out.println("User logged out successfully");
		RequestDispatcher dispatcher = request.getRequestDispatcher("SignIn.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
