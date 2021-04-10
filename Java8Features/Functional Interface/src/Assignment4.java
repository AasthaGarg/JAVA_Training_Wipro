import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employees {
	int id;
	String name;
	int salary;
	public Employees(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name;
	}

}
public class Assignment4{
	public static void main(String[] args) {
		List<Employees> list=new ArrayList<Employees>();
		list.add(new Employees(101,"Rahul",2220));
		list.add(new Employees(102,"Mahi",2300));
		list.add(new Employees(103,"Sachin",15000000));
		list.add(new Employees(104,"Parul",3000));
		list.add(new Employees(105,"Mishi",9000));
		list.add(new Employees(106,"Parikh",3400000));
		list.add(new Employees(107,"Suman",43000));
		
		Predicate<Employees> p=x->x.getSalary()<10000;
		list.stream().filter(p).forEach(System.out::println);
		
	}
	
}
