package get_and_post;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment1Servlet")
public class Assignment1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res){
		try {
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Request object example</title>");
			out.println("</head>");
			out.println("<body bgcolor=\"yellow\">");
			out.println("<h1>"+"Headers detail:"+"</h1>"+"<hr>");
			Enumeration<String> headerNames=req.getHeaderNames();
			out.println("<table border=0>");
			while(headerNames.hasMoreElements()){
				String headerName=headerNames.nextElement();
				String headerValue=req.getHeader(headerName);
				out.print("<tr><td bgcolor=\"#CCCCCC\">");
				out.println("<b>"+headerName+"</b>"+"="+headerValue);
				out.println("</td><td>");
				out.println("</td></tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
