package data;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuctionServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		int id=Integer.parseInt(req.getParameter("iid"));
		req.setAttribute("id", id);
		String iname=req.getParameter("iname");
		req.setAttribute("iname", iname);
		String uname=req.getParameter("uname");
		req.setAttribute("uname", uname);
		String email=req.getParameter("email");
		req.setAttribute("email", email);
		int amt=Integer.parseInt(req.getParameter("amount"));
		req.setAttribute("amount", amt);
		String inc=req.getParameter("bid");
		if(inc==null) {
			req.setAttribute("inc", false);
		}
		else {
			req.setAttribute("inc", true);
		}
		RequestDispatcher requestDispatcher =req.getRequestDispatcher("Auction.jsp");
		requestDispatcher.forward(req,res);
	}

}

