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
		Employee empobj=new Employee("Mahi","Developer",5000000);
		session.save(empobj);
		empobj=new Employee("Mohani","Tester",6000000);
		session.save(empobj);
		empobj=new Employee("Suri","Manager",5500000);
		session.save(empobj);
		empobj=new Employee("Koko","HR",4800000);
		session.save(empobj);
		empobj=new Employee("John","Painter",300000);
		session.save(empobj);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(empobj);
		session.close();
		
		
	}

}
