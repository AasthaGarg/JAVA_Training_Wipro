package get_and_post;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment2Servlet")
public class Assignment2Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res){
		try {
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Request object example</title>");
			out.println("</head>");
			out.println("<body bgcolor=\"yellow\">");
			out.println("<h2>"+"User Details"+"</h2>");
			Enumeration<String> reqParams=req.getParameterNames();
			while(reqParams.hasMoreElements()){
				String name=(String)reqParams.nextElement();
				String value=req.getParameter(name);
				out.println("<b>"+name+"</b>"+"="+value+"<br>");
			}
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
