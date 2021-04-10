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
    public String deleteDetails(int id) {
    	Session session=sessionFactory.openSession();
    	Transaction trx=session.beginTransaction();
    	Employee empobj=new Employee();
    	empobj=session.get(Employee.class, id);
    	if(empobj==null) {
    		return "Record not found";
    	}
    	empobj.setId(id);
		session.delete(empobj);
		trx.commit();
		session.close();
		return "Successfully deleted";
    }

}
