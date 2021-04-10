package cookies_and_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Assignment2Servlet")
public class Assignment2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		Cookie cookie=null;
		Cookie[] cookies=null;
		cookies=req.getCookies();
		res.setContentType("text/html");
		try {
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Reading cookies!</title>");
			out.println("</head>");
			out.println("<body>");
			if(cookies!=null){
				out.print("<table border=\"1\">");
				out.println("<tr>\n"+"<th>Name</th>\n"+"<th>Value</th>\n"+"</tr>\n");
				for(int i=0;i<cookies.length;i++){
					cookie=cookies[i];
					out.print("<tr>\n"+"<td>"+cookie.getName()+"</td>"+"<td>"+cookie.getValue()+"</td></tr>\n");
					
				}
				out.print("</table>");
			}
			else{
				out.print("No cookies");
			}
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
