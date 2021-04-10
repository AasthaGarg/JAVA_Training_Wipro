/*Modification of Student record 
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.
 Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table for that particular student.*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment4 {
	public static void main(String args[]) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno=Integer.parseInt(args[0]);
	    double fee=Double.parseDouble(args[1]);
		String sql="UPDATE stdnt SET fees=? WHERE rollno=?";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setDouble(1, fee);
			pstmt.setInt(2, rollno);
			int logged=pstmt.executeUpdate();
			
			if(pstmt.executeUpdate()==1 && logged==1)
				System.out.println("Student record is successfully updated.");
			else
				System.out.println("Error");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}


}
