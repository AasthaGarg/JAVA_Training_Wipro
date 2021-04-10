/* Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator 
 * and enumeration to list all the elements of the Vector.*/

import java.util.Vector;
import java.util.Iterator;

class Employee{
	int id;
	String name;
	String email;
	Double salary;
	
	public Employee(int id,String name,String email,Double salary) {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+",email="+email+
				",salary="+salary+"]";
	}
}
public class Assignment7 {
	public static void main(String args[]) {
		Vector<Employee> list=new Vector<>();
		Employee emp1=new Employee(101,"Bob","bob@gmail.com",25000.0);
		Employee emp2=new Employee(102,"Alice","alice@gmail.com",30000.0);
		Employee emp3=new Employee(103,"John","john@gmail.com",20000.0);
		Employee emp4=new Employee(104,"Ram","ram@gmail.com",50000.0);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
