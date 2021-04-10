/* Deleting a Student’s record When a student leaves the school, the record related to that student needs to be deleted from the Student
 *  table. The student’s roll no, whose record has to be deleted, should be passed as a command line argument.Upon deletion, the Student 
 *  details must be stored in another table named StudentLog which will maintain the details such as Rollno, StudentName, Standard and 
 *  Leaving_date.*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Assignment3 {
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
		String sql="";
		
		try {
			sql="INSERT INTO stdnt_log(rollno,studentname,standard) SELECT rollno,studentname,standard FROM stdnt WHERE rollno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			int logged=pstmt.executeUpdate();
			
			sql="UPDATE stdnt_log SET LEAVING_DATE=CURRENT_DATE WHERE rollno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			logged=pstmt.executeUpdate();
			
			sql="DELETE FROM stdnt WHERE rollno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,rollno);
			
			if(pstmt.executeUpdate()==1 && logged==1)
				System.out.println("Student having rollno="+rollno+" deleted successfully.");
			else
				System.out.println("Error");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
