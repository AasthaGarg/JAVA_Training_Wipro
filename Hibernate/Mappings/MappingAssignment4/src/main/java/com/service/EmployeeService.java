package com.service;


import java.util.Scanner;

import com.DAO.EmployeeDAO;
import com.bean.Employee;
import com.bean.Passport;

public class EmployeeService {
	public static void main(String[] args) {
		
		EmployeeDAO dao=new EmployeeDAO();
		System.out.println("Enter choice 1-2");
		System.out.println("1. Add record");
		System.out.println("2. Delete record");
		Scanner sc=new Scanner(System.in);
		int choice=Integer.parseInt(sc.next());
		switch(choice) {
		case 1: 
		{
			Passport passobj1=new Passport();
			passobj1.setPno(120);
			passobj1.setNation("India");
			Employee empobj1=new Employee();
			empobj1.setName("Kartik");
			empobj1.setPassport(passobj1);
			System.out.println("Result: "+dao.insertDetails(empobj1));
		}
		break;
		case 2:
		{
			System.out.println("Result: "+dao.deleteDetails(2));
		}
		break;
		default:
			System.out.println("Invalid choice");
		}
		sc.close();
	    
	}

}
