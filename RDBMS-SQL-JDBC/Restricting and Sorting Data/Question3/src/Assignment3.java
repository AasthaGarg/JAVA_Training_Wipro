/* To find high-salary and low-salary employees. Create a query to display the last name and salary 
 * for any employee whose salary is not in the range of $5,000 to $12,000*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment3 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			String sql="select last_name,salary from employees where salary<5000 or salary>12000";
			pst=myconnection.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (myconnection != null) myconnection.close();
		}
	}

}
