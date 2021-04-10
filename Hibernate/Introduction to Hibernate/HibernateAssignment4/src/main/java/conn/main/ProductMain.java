package conn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import conn.bean.Product;

public class ProductMain {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product proobj=new Product("Laptop",5000000);
		session.save(proobj);
		proobj=new Product("Mouse",6000);
		session.save(proobj);
		proobj=new Product("Keyboard",55000);
		session.save(proobj);
		proobj=new Product("Bottle",480);
		session.save(proobj);
		proobj=new Product("Pen",35);
		session.save(proobj);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(proobj);
		session.close();
		
		
	}

}
