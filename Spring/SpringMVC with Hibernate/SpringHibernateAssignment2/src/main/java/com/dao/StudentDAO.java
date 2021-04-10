package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Student;


@Repository
@Transactional
public class StudentDAO {
	JdbcTemplate template;
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public StudentDAO(DataSource dataSource) {
		template= new JdbcTemplate(dataSource);
	}
	
	public List<Student> displayStudent() {
		  List<Student> list=template.query("select * from Student",new RowMapper<Student>(){  
		        public Student mapRow(ResultSet rs, int row) throws SQLException {  
		        	Student s = new Student();  
		            s.setRollno(rs.getString("rollno"));  
		            s.setName(rs.getString("name"));  
		            s.setAddress(rs.getString("address"));
		            
		            return s;  
		        }  
		    });
		  return list;
	}

}
