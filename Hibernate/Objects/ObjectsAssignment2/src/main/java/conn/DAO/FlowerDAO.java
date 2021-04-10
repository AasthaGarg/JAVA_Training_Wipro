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
	public String deleteFlower(String id) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Flower flowerobj=new Flower();
		flowerobj=session.get(Flower.class, id);
		if(flowerobj==null) {
			return "Record does not exist";
		}
		flowerobj.setId(id);
		session.delete(flowerobj);
		transaction.commit();
		session.close();
		return "Successfully deleted";
	}

}
