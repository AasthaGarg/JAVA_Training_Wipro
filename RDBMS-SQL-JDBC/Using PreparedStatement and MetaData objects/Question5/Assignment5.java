/* Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student.*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Assignment5 {
	public static void main(String args[]) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno=0;
	    try {
	    	rollno=Integer.parseInt(args[0]);
	    }catch(Exception e) {}
		
		try {
			if(rollno!=0)
				sql="SELECT * FROM stdnt WHERE rollno=?";
			else
				sql="SELECT * FROM stdnt";
				
			pstmt=conn.prepareStatement(sql);
			if(rollno!=0) pstmt.setInt(1, rollno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int ROLLNO=rs.getInt("ROLLNO");
				String STUDENTNAME=rs.getString("STUDENTNAME");
				String STANDARD=rs.getString("STANDARD");
				String DATE_OF_BIRTH=rs.getString("DATE_OF_BIRTH");
				double FEES=rs.getDouble("FEES");
				System.out.println(ROLLNO+" "+STUDENTNAME+" "+STANDARD+" "+DATE_OF_BIRTH+" "+FEES);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}


}
