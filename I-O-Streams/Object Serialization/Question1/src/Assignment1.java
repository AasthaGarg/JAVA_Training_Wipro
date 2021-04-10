/*Create a class called Employee with properties name(String),dateOfBirth(java.util.Date),department(String),designation(String) and Salary(double).

Create respective getter and setter methods and constructors (no-argument constructor and parameterized constructor) for the same.

Create an object of the Employee class and save this object in a file called "data" using serialization.
Later using deserialization read this object and print the properties of this object.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import bean.Employee;

public class Assignment1 {
	public static void main(String args[]) throws IOException,ClassNotFoundException{
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		int flag=0;
		System.out.println("Ener name:");
		emp.setName(sc.nextLine());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		Date date=null;
		while(flag!=1) {
			try {
				System.out.println("Enter D.O.B. format(MM-dd-yyyy):");
				date=sdf.parse(sc.nextLine());
				flag=1;
			} catch (ParseException e) {
				System.out.println("Use date format(MM-dd-yyyy)");
			}
		}
		emp.setDob(date);
		System.out.println("Enter department:");
		emp.setDepartment(sc.nextLine());
		System.out.println("Enter designation:");
		emp.setDesignation(sc.nextLine());
		System.out.println("Enter salary:");
		emp.setSalary(sc.nextDouble());
		
		FileOutputStream fos=new FileOutputStream("data.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		fos.close();
		oos.close();
		
		FileInputStream fis=new FileInputStream("data.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2=(Employee) ois.readObject();
		fis.close();
		ois.close();
		
		System.out.println("Name: "+emp2.getName());
		System.out.println("D.O.B: "+emp2.getDob());
		System.out.println("Department: "+emp2.getDepartment());
		System.out.println("Designation: "+emp2.getDesignation());
		System.out.println("Salary: "+emp2.getSalary());
		sc.close();
	}

}
