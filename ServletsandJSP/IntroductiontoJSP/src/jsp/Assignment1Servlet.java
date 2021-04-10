package jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment1Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res){
		try {
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			int number=Integer.parseInt(req.getParameter("number"));
			List<Integer> primeList=new ArrayList<>();
			for(int i=0;i<number;i++){
				if(isPrime(i))
					primeList.add(i);
			}
			req.setAttribute("primeList",primeList);
			req.getRequestDispatcher("primeResult.jsp").forward(req, res);
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
	}

	public static boolean isPrime(int input1) {
		if(input1==1)
			return false;
		for(int i=2;i<input1;i++){
			if(i==input1)
				continue;
			if(input1%i==0){
				return false;
			}
		}
		return true;
	}
}
