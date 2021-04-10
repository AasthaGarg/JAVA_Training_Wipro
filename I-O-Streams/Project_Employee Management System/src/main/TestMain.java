package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import bean.Employee;
public class TestMain {
	public static void main(String args[]) 
			throws IOException,FileNotFoundException,ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String filename="data.ser";
		
		FileOutputStream fos=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		FileInputStream fis=new FileInputStream(filename);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		do {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Employee emp=new Employee();
			    System.out.println("Enter Employee ID: ");
			    emp.setId(sc.nextInt());
			    sc.nextLine();
			    System.out.println("Enter Employee Name: ");
			    emp.setName(sc.nextLine());
			    System.out.println("Enter Employee Age: ");
			    emp.setAge(sc.nextInt());
			    System.out.println("Enter Employee Salary: ");
			    emp.setSalary(sc.nextDouble());
			    oos.writeObject(emp);
			    break;
			case 2:
				emp=null;
				System.out.println("----Report----");
				while(fis.available()>0) {
					emp=(Employee) ois.readObject();
					System.out.println(emp);
					
				}
				System.out.println("----End of Report----");
				break;
			case 3:
				System.out.println("Exiting the System");
				break;
			}
			
		}while(choice!=3);
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();
	}

}
