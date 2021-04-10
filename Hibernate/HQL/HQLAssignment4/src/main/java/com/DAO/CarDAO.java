package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Car;

public class CarDAO {
	SessionFactory factory;
	public CarDAO() {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	public List<Car> getCarDetails(){
		Session session=factory.openSession();
		String hql="from Car "+"Where manufacturer like 'V%'";
		Query<Car> query=session.createQuery(hql);
		return query.list();
	}

}
