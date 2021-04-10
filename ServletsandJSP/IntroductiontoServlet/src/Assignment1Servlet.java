import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment1Servlet")
public class Assignment1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try {
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>First Servlet Program!</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Welcome to First Servlet Program</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

