/* Write a java program that connects to oracle database, queries the inbuilt table “emp” and displays the first
 *  two columns (empno using column index and ename using column name ) of all the rows.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment1 {
	public static void main(String[] args) throws SQLException {
		Connection myconnection = null;
		Statement stm=null;
		ResultSet rs=null;
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			myconnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
			stm=myconnection.createStatement();
			rs=stm.executeQuery("Select empno,ename from emp");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString("ename"));
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (myconnection != null) myconnection.close();
		}
	}
}
