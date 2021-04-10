package com.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.bean.*;

public class CarCriteria {
	SessionFactory factory;
	public CarCriteria() {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
    public List<Car> getCarDetails(String color){
    	Session session=factory.openSession();
    	Criteria cr=session.createCriteria(Car.class);
    	cr.add(Restrictions.eq("color",color));
    	List<Car> result=cr.list();
    	return result;
    }
}
