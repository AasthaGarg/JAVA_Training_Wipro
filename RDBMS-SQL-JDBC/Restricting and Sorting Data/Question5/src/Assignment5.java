/* Display the last name and department ID of all employees in departments 20 or 50 in ascending alphabetical order by name.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment5 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			String sql="select last_name,department_id from employees where department_id in(20,50) order by last_name";
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
