package conn.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import conn.bean.Flower;

public class FlowerDAO {
	SessionFactory sessionFactory;
	public FlowerDAO() {
		Configuration cfg=new Configuration().configure();
		sessionFactory=cfg.buildSessionFactory();
	}
	public Flower updateFlower(String id,int price) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Flower flowerobj=new Flower();
		flowerobj=session.get(Flower.class, id);
		if(flowerobj!=null) {
			flowerobj.setPrice(price);
			session.update(flowerobj);
			transaction.commit();
			session.close();
		}
		
		return flowerobj;
	}


}
