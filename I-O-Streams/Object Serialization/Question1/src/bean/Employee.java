package bean;
import java.io.Serializable;
import java.util.Date;
public class Employee implements Serializable {
	String name;
	Date dob;
	String department;
	String designation;
    double salary;
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public Date getDob() {
    	return dob;
    }
    public void setDob(Date dob) {
    	this.dob=dob;
    }
    public String getDepartment() {
    	return department;
    }
    public void setDepartment(String department) {
    	this.department=department;
    }
    public String getDesignation() {
    	return designation;
    }
    public void setDesignation(String designation) {
    	this.designation=designation;
    }
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double salary) {
    	this.salary=salary;
    }
   
}
