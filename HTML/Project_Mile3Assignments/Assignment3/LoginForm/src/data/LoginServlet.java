package data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,
	IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		UserBean user=new UserBean();
		user.setUserName(name);
		user.setPassWord(password);
		int status=UserDAO.save(user);
		if(status>0) {
			req.getRequestDispatcher("Login.html").include(req,res);
		}
		else {
			out.println("<p>Can not register you</p>");
			req.getRequestDispatcher("Register.html").include(req,res);
		}
		out.close();
	}

}
