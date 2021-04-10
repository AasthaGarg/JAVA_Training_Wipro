import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private String address;
	private int salary;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
public class Assignment2 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		List<Employee> e=new ArrayList<Employee>();
		emp.setId(121);
		emp.setName("Mahi");
		emp.setSalary(220000);
		emp.setAddress("Delhi");
		e.add(emp);
		emp=new Employee();
		emp.setId(122);
		emp.setName("Sona");
		emp.setSalary(250000);
		emp.setAddress("New Delhi");
		e.add(emp);
		emp=new Employee();
		emp.setId(123);
		emp.setName("Priya");
		emp.setSalary(320000);
		emp.setAddress("Banglore");
		e.add(emp);
		emp=new Employee();
		emp.setId(124);
		emp.setName("Sakshi");
		emp.setSalary(420000);
		emp.setAddress("Noida");
		e.add(emp);
		emp=new Employee();
		emp.setId(125);
		emp.setName("Kalsi");
		emp.setSalary(40000);
		emp.setAddress("Punjab");
		e.add(emp);
		e.forEach(System.out::println);	
	}


}
