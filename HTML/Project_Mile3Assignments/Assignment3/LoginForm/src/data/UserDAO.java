package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","SYSTEM","SYSTEM");
		}
		catch(Exception e) {
			e.printStackTrace();
	
		}
		return conn;
	}
	
	public static int save(UserBean user) {
		int status=0;
		try {
			Connection conn=UserDAO.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into LOGIN(name,password) values(?,?)");
			ps.setString(1, user.getUserName());
			ps.setNString(2, user.getPassWord());
			status=ps.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int update(UserBean user) {
		int status=0;
		try {
			Connection conn=UserDAO.getConnection();
			PreparedStatement ps=conn.prepareStatement("update LOGIN set password=? where name=? and password=?");
			ps.setString(1, user.getPassWord());
			ps.setString(2, user.getUserName());
			ps.setNString(3, user.getOldpassWord());
			status=ps.executeUpdate();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	public static int checkUser(UserBean userBean) {
		int status=0;
		try {
			Connection conn=UserDAO.getConnection();
			String sql="select * from LOGIN where name=? and password=?";
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1, userBean.getUserName());
			st.setString(2, userBean.getPassWord());
			ResultSet rs=st.executeQuery();
			if(rs.next())
				status=1;
			st.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
