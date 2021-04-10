package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Employee;
import com.model.Login;
import com.model.User;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int register(User user) {
		
		String sql = "insert into users values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {user.getUsername(), user.getPassword(), user.getEmpname(), user.getEmpno(), user.getEmail() });
	}
	
	public User validateUser(Login login) {
		
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
		
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}

	public int save(Employee emp) {
		String sql = "insert into Employee values(?,?,?,?,?,?,?,?)";
		
		return jdbcTemplate.update(sql,new Object[] {emp.getId(),emp.getName(),emp.getGender(),emp.getDesignation(),emp.getSalary()
				,emp.getCity(),emp.getEmail(),emp.getMobileno()});
		
	}

	public List<Employee> getEmployees(){  
	    return jdbcTemplate.query("select * from Employee",new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	        	Employee e = new Employee();  
	            e.setId(rs.getInt("id"));  
	            e.setName(rs.getString("name")); 
	            e.setGender(rs.getString("gender"));
	            e.setDesignation(rs.getString("designation"));
	            e.setSalary(rs.getInt("salary"));
	            e.setCity(rs.getString("city"));
	            e.setEmail(rs.getString("email"));
	            e.setMobileno(rs.getLong("mobileno"));
	            return e;  
	        }  
	    });
	}

	public Employee getEmpById(int id){  
	    String sql="select * from Employee where id=?";  
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
	}

	public int update(Employee emp) {
		 String sql="update Employee set name='"+emp.getName()+"',gender='"+emp.getGender()+"',designation='"+emp.getDesignation()+"',salary="+emp.getSalary()+
				 ",city='"+emp.getCity()+"',email='"+emp.getEmail()+"',mobileno="+emp.getMobileno()+" where id="+emp.getId()+"";  
		 return jdbcTemplate.update(sql);
	}

	public int delete(int id) {
		String sql="delete from Employee where id="+id+"";  
	    return jdbcTemplate.update(sql); 
	}

}

class UserMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		
		User user = new User();
		
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setEmpname(rs.getString("empname"));
		user.setEmpno(rs.getString("empno"));
		user.setEmail(rs.getString("email"));
		
		return user;
	}

}
