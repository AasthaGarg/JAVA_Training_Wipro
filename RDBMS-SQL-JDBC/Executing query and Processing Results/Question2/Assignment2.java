/* Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
 * Display the columns ename, job, sal and comm.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment2 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
			stm=conn.createStatement();
			rs=stm.executeQuery("select ename,job,sal,comm from Emp where sal>1000 and sal<2000");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null) conn.close();
		}
	}
}
