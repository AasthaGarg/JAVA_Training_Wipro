package javaBeans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Assignment3Servlet extends HttpServlet {
	Connection conn=null;
	PreparedStatement pstmt=null;
	protected void doGet(HttpServletRequest req,HttpServletResponse res){
		PrintWriter out=null;
		try {
			out=res.getWriter();
			res.setContentType("text/html");
			conn=DBUtil3.getConnection();
			String sql="INSERT INTO emp_test VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(2, req.getParameter("name"));
			pstmt.setInt(1, Integer.parseInt(req.getParameter("id")));
			pstmt.setString(3, req.getParameter("designation"));
			pstmt.executeUpdate();
			out.println("Success");
			req.setAttribute("result", "Success");
		}
		catch (SQLException e) {
			req.setAttribute("result", "Failed");
			out.println("Failed");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
