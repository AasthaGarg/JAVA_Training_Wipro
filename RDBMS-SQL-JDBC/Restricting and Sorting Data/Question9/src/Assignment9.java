/*Create a report to display the last name, salary, and commission of all employees who earn commissions. 
Sort data in descending order based on salary and commissions. Use the column’s numeric position in the ORDER BY clause.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment9 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			String sql="select last_name,salary,commission_pct*salary AS commission from employees where "
					+ "commission_pct IS NOT NULL order by salary DESC,commission DESC";
			pst=myconnection.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (myconnection != null) myconnection.close();
		}
	}


}
