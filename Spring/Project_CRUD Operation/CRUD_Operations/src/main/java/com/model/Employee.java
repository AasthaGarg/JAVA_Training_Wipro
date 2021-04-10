package com.model;

public class Employee {
	
	private int id;
	private String name;
	private String gender;
	private String designation;
	private int salary;
	private String city;
	private String email;
	private long mobileno;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String gender, String designation, int salary, String city, String email,
			long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		this.email = email;
		this.mobileno = mobileno;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", designation=" + designation
				+ ", salary=" + salary + ", city=" + city + ", email=" + email + ", mobileno=" + mobileno + "]";
	}
	

}
