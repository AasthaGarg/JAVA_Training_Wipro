/* Display the last names of all employees who have both an “a” and an “e” in their last name.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment13 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			String sql="select last_name from employees where last_name like '%a%' AND last_name like '%e%'";
			pst=myconnection.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
				System.out.println(rs.getString(1));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (myconnection != null) myconnection.close();
		}
	}


}
