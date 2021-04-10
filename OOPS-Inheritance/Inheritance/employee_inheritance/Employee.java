package employee_inheritance;

public class Employee extends Person {
	double annualSalary;
	int year;
	String insuranceNo;
	Employee(String name,double salary,int y,String number) {
		super(name);
		annualSalary=salary;
		year=y;
		insuranceNo=number;
	}
	//getter
	public double getSalary() {
		return annualSalary;
	}
	public int getYear() {
		return year;
	}
	public String getinsuranceNo() {
		return insuranceNo;
	}
	//setter
	public void setannualSalary(double salary) {
		annualSalary=salary;
	}
	public void setYear(int y) {
		year=y;
	}
	public void setinsuranceNo(String no) {
		insuranceNo=no;
	}
}
