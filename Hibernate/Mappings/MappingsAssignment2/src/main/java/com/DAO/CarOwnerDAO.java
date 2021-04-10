package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Car;
import com.bean.CarOwner;


public class CarOwnerDAO {
	public static void main(String[] args) {
		SessionFactory factory;
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory(); 
	       
	    Session session=factory.openSession();  
	    Transaction t=session.beginTransaction();  
	    
	    CarOwner carowner1=new CarOwner();
	    carowner1.setOwnerName("Saket");  
	    carowner1.setOwnerId(101);
	    
	        
	    Car car1=new Car(); 
	    car1.setRegno("LLL-44");
	    car1.setModel("AVV");
	    car1.setColor("White");
	    car1.setManufacturer("Toyota");  
	    car1.setCarowner(carowner1);
	       
	    Car car2=new Car();
	    car2.setRegno("LLT-48");
	    car2.setModel("AVT");
	    car2.setColor("Black");
	    car2.setManufacturer("Volkswagen");
	    car2.setCarowner(carowner1);
	         
	    session.save(carowner1);   
	    session.save(car1);
	    session.save(car2);
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");   

		
	}
	
}
