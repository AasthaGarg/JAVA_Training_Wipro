/*1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender 
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program.*/
package main;
import bean.EmployeeDB;
import bean.Employee;
public class MainTest {
	public static void main(String args[]) {
		EmployeeDB empDb=new EmployeeDB();
		
		Employee emp1=new Employee(101,"Bob","bob@gmail.com","Male",25000);
		Employee emp2=new Employee(102,"Alice","alice@gmail.com","Female",30000);
		Employee emp3=new Employee(103,"John","john@gmail.com","Male",20000);
		Employee emp4=new Employee(104,"Ram","ram@gmail.com","Male",50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);
		
		System.out.println("Employee details:");
		for(Employee emp: empDb.listAll())
			emp.GetEmployeeDetails();
		System.out.println();
		
		empDb.deleteEmployee(102);
        System.out.println("Employee details after deleting few records:");
        for(Employee emp: empDb.listAll())
			emp.GetEmployeeDetails();
        
		System.out.println();
		System.out.println(empDb.showPaySlip(103));
	}

}
