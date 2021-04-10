package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDAO {
	SessionFactory sessionFactory;
	public EmployeeDAO() {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
    public String insertDetails(Employee obj) {
    	Session session=sessionFactory.openSession();
    	Transaction trx=session.beginTransaction();
    	session.save(obj);
    	trx.commit();
    	return "successfully saved";
    }

}
