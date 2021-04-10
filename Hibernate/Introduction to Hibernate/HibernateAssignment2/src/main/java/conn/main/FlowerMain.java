package conn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import conn.bean.Flower;

public class FlowerMain {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		Flower flowerobj=new Flower("102","Rose","Red",500);
		session.save(flowerobj);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(flowerobj);
		session.close();
		
		
	}

}
