package javaBeans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment2Servlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res){
		try {
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			int number=Integer.parseInt(req.getParameter("number"));
			req.setAttribute("number", number);
			if(number<10)
				req.getRequestDispatcher("page1.jsp").forward(req, res);
			else if(number>=10 && number<99)
				req.getRequestDispatcher("page2.jsp").forward(req, res);
			else
				req.getRequestDispatcher("error.jsp").forward(req, res);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
