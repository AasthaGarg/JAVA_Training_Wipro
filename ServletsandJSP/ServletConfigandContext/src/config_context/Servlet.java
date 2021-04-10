package config_context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		res.setContentType("text/html");
		try {
			PrintWriter out=res.getWriter();
			ServletConfig config=getServletConfig();
			Enumeration<String> e=config.getInitParameterNames();
			String str="";
			out.print("<h3>"+"Servlet config parameters:"+"</h3>");
			while(e.hasMoreElements()){
				str=e.nextElement();
				out.print("<br>Name: "+str);
				out.print("<br>Value: "+config.getInitParameter(str));
			}
			ServletContext context=getServletContext();
			e=context.getInitParameterNames();
			str="";
			out.print("<h3>"+"Servlet context parameters:"+"</h3>");
			while(e.hasMoreElements()){
				str=e.nextElement();
				out.print("<br>Name: "+str);
				out.print("<br>Value: "+context.getInitParameter(str));
			}
			out.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
