import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int empNo;
	String name;
	int age;
	String location;
	public Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Parikh",24,"Bihar"));
		list.add(new Employee(102,"Mahi",23,"Pune"));
		list.add(new Employee(103,"Sahil",25,"Panipat"));
		list.add(new Employee(104,"Makar",32,"Hyderabad"));
		list.add(new Employee(105,"Mishi",40,"Pune"));
		
		List<Employee> newList=list.stream().filter(e->e.location=="Pune").collect(Collectors.toList());
		System.out.println(newList);
	}

}
