package bean;

public class Employee {
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public Employee(int empId,String empName,String email,String gender,float salary) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public void GetEmployeeDetails() {
		System.out.println("EmpId- "+empId+" EmpName- "+empName+
				" Email- "+email+" Gender- "+gender+" Salary- "+salary);
	}

}
