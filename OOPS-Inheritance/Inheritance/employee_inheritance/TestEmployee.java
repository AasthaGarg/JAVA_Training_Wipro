package employee_inheritance;

public class TestEmployee {
	public static void main(String args[]) {
		Employee e=new Employee("Ram",20000,2019,"RS1234");
		System.out.println("Emloyee name:"+e.getName());
		System.out.println("Employee salary:"+e.getSalary());
		System.out.println("Year employee started working:"+e.getYear());
		System.out.println("Employee national insurance no."+e.getinsuranceNo());
		e.setName("Rashi");
		e.setannualSalary(40000);
		e.setYear(2018);
		e.setinsuranceNo("PE3267");
		System.out.println("Emloyee name:"+e.getName());
		System.out.println("Employee salary:"+e.getSalary());
		System.out.println("Year employee started working:"+e.getYear());
		System.out.println("Employee national insurance no."+e.getinsuranceNo());
		
	}

}
