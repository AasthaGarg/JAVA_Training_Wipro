package main;
import bean.Employee;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class TestMain {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		List<Employee> array=new ArrayList<>();
		
		System.out.println("Enter the Number of Employees");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Employee "+i+" Details:");
			System.out.println("Enter the Firstname");
			String firstName=sc.next();
			System.out.println("Enter the Lastname");
			String lastName=sc.next();
			System.out.println("Enter the Mobile");
			int mobileNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Email");
			String email=sc.nextLine();
			System.out.println("Enter the Address");
			String address=sc.nextLine();
			array.add(new Employee(firstName,lastName,mobileNo,email,address));
		}
		Collections.sort(array);
		System.out.println();
		System.out.println("Employee List:");
		System.out.println();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "FirstName","SecondName","MobileNumber","Email","Address");
		System.out.println();
		Iterator<Employee> it=array.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.getFirstName(),emp.getLastName(),emp.getMobileNumber(),emp.getEmail(),emp.getAddress());
			System.out.println();
		}
		sc.close();
	}

}
