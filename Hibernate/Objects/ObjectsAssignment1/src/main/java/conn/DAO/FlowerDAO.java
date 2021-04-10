package conn.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import conn.bean.Flower;

public class FlowerDAO {
	SessionFactory sessionFactory;
	public FlowerDAO() {
		Configuration cfg=new Configuration().configure();
		sessionFactory=cfg.buildSessionFactory();
	}
	public Flower getFlower(String id) {
		Session session=sessionFactory.openSession();
		Flower flowerobj=new Flower();
		flowerobj=session.get(Flower.class, id);
		session.close();
		return flowerobj;
	}

}
