package com.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.CarOwner;

public class CarOwnerDAO {
	SessionFactory sessionFactory;
	public CarOwnerDAO() {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
    public String insertDetails(CarOwner obj) {
    	Session session=sessionFactory.openSession();
    	Transaction trx=session.beginTransaction();
    	session.persist(obj.getCarobj());
    	session.persist(obj);
    	trx.commit();
    	return "success";
    }
}
