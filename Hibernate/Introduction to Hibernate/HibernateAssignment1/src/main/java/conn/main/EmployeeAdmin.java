package conn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import conn.bean.Employee;

public class EmployeeAdmin {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee empobj=new Employee(104,"Shanu","Mumbai");
		session.save(empobj);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(empobj);
		session.close();
		
		
	}

}
