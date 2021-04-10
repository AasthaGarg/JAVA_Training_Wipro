import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String location;
	int salary;
	public Employee(int id, String name, String location, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
@FunctionalInterface
interface getLocation{
	List<String> location(List<Employee> emp);
	
}
public class Assignment1 {
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Rahul","Pune",222000));
		list.add(new Employee(102,"Mahi","Bihar",230000));
		list.add(new Employee(103,"Sachin","Delhi",15000000));
		list.add(new Employee(104,"Parul","UP",30000));
		
		
		getLocation obj=result->{
			List<String> newList=new ArrayList<String>();
			for(Employee emp:list) {
				newList.add(emp.getLocation());
			}
			return newList;
		};
		List<String> newList=obj.location(list);
		System.out.println(newList);
	}

}
