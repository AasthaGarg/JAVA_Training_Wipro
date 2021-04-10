package com.service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Continent;


public class ContinentService {
public static void main(String []args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("India", "New Delhi");
		h.put("Bangladesh","Dhaka");
		h.put("Sri Lanka","Columbo");
		Continent c=new Continent(1,"Asia",h);
		HashMap<String,String> h2=new HashMap<String,String>();
		h2.put("Kenya", "Nairobi");
		h2.put("Morocco","Rabat");
		h2.put("Zambia","Lusaka");
		Continent c2=new Continent(2,"Africa",h2);
		HashMap<String,String> h3=new HashMap<String,String>();
		h3.put("Belgium", "Brussels");
		h3.put("Bulgeria","Sofia");
		h3.put("France","Paris");
		h3.put("Greece","Athens");
		h3.put("Ireland","Dublin");
		h3.put("Switzerland","Bern");
		Continent c3=new Continent(3,"Europe",h3);
		session.persist(c);
		session.persist(c2);
		session.persist(c3);
		tx.commit();
		System.out.println("success");
		session.close();
		
		
	}

}
