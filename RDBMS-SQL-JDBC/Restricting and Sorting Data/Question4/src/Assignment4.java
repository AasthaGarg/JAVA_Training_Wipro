/*Create a report to display the last name, job ID, and hire date for employees with the last names of Matos and Taylor. 
 * Order the query in ascending order by the hire date.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment4 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			String sql="select last_name,job_id,hire_date from employees where last_name in('Matos','Taylor') order by hire_date";
			pst=myconnection.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (myconnection != null) myconnection.close();
		}
	}
}
