package data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,
	IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd3");
		String oldpassword=req.getParameter("pwd");
		UserBean user=new UserBean();
		user.setUserName(name);
		user.setPassWord(password);
		user.setOldpassWord(oldpassword);
		int status=UserDAO.update(user);
		if(status>0) {
			out.println("<p>Changes updated</p>");
			req.getRequestDispatcher("Login.html").include(req,res);
		}
		else {
			out.println("<p>Please enter valid credentials</p>");
			req.getRequestDispatcher("ChangePassword.html").include(req,res);
		}
		out.close();
	}

}
