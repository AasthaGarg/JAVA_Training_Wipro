package cookies_and_session;

import java.io.PrintWriter;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Assignment3Servlet")
public class Assignment3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
			HttpSession session=req.getSession(true);
			Date createTime=new Date(session.getCreationTime());
			Date lastAccessTime=new Date(session.getLastAccessedTime());
			Integer visitCount=new Integer(0);
			String visitCountKey=new String("visitCount");
			String userIDKey =new String("userID");
			String userID=new String("ABCD");
			if(session.isNew()){
				session.setAttribute(userIDKey,userID);
				session.setAttribute(visitCountKey,visitCount);
			}
			else{
				visitCount=(Integer)session.getAttribute(visitCountKey);
				visitCount=visitCount+1;
				userID=(String)session.getAttribute(userIDKey);
			}
			session.setAttribute(visitCountKey,visitCount);
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println(
			         "<html>\n" +
			            "<head><title>" + "Session tracking" + "</title></head>\n" +
			            
			            "<body>\n" +
			               
			               "<h2 align = \"center\">Session Infomation</h2>\n" +
			               "<table border = \"1\" align = \"center\">\n" +
			                  
			                  "<tr bgcolor = \"#949494\">\n" +
			                     "  <th>Session info</th><th>value</th></tr>\n" +
			           
			                  "<tr>\n" +
			                     "  <td>id</td>\n" +
			                     "  <td>" + session.getId() + "</td></tr>\n" +
			                  
			                  
			                  "<tr>\n" +
			                     "  <td>Creation Time</td>\n" +
			                     "  <td>" + createTime + "  </td></tr>\n" +
			                  
			                  
			                  "<tr>\n" +
			                     "  <td>Time of Last Access</td>\n" +
			                     "  <td>" + lastAccessTime + "  </td></tr>\n" +
			                  
			                  
			                  "<tr>\n" +
			                     "  <td>User ID</td>\n" +
			                     "  <td>" + userID + "  </td></tr>\n" +
			                  
			                  
			                  "<tr>\n" +
			                     "  <td>Number of visits</td>\n" +
			                     "  <td>" + visitCount + "</td></tr>\n" +
			                  
			               "</table>\n" +
			            "</body></html>"
			         
			      );
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}