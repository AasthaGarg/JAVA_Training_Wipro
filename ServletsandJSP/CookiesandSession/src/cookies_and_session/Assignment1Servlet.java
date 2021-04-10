package cookies_and_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Assignment1Servlet")
public class Assignment1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		HttpSession session=req.getSession(true);
		String title="Welcome back";
		if(session.isNew()){
			title="Welcome,you are visiting for the first time";
		}
		res.setContentType("text/html");
		try {
			PrintWriter out=res.getWriter();
			out.println(title);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
