package main;

import java.util.Scanner;
import bean.SBAccount;
import bean.RDAccount;
import bean.FDAccount;

public class InterestCalculator {
public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		int choice;
		do {
			System.out.println("MAIN MENU\n---------");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			System.out.println("Enter your option (1..4):");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				SBAccount sbaccount=new SBAccount();
				System.out.println("Enter the Average amount in your account:");
				sbaccount.setAmount(s.nextDouble());
				System.out.println("Interest gained: Rs. "+sbaccount.calculateInterest());
				break;
			case 2:
				FDAccount fdaccount=new FDAccount();
				System.out.println("Enter the FD amount:");
				fdaccount.setAmount(s.nextDouble());
				System.out.println("Enter the number of days:");
				int noOfDays=s.nextInt();
				while(noOfDays<0) {
					System.out.println("Invalid Number of days. Please enter non-negative values.");
					System.out.println("Enter the number of days:");
					noOfDays=s.nextInt();
				}
				fdaccount.setNoOfDays(noOfDays);
				System.out.println("Enter your age:");
				int age=s.nextInt();
				while(age<0) {
					System.out.println("Invalid Age. Please enter non-negative values.");
					System.out.println("Enter your age:");
					age=s.nextInt();
				}
				fdaccount.setAgeOfACHolder(age);
				System.out.println("Interest gained: Rs. "+fdaccount.calculateInterest());
				break;
			case 3:
				RDAccount rdaccount=new RDAccount();
				System.out.println("Enter the RD amount:");
				rdaccount.setAmount(s.nextDouble());
				System.out.println("Enter number of months:");
				int noOfMonths=s.nextInt();
				while(noOfMonths<0) {
					System.out.println("Invalid Number of months. Please enter non-negative values.");
					System.out.println("Enter number of months:");
					noOfMonths=s.nextInt();
				}
				rdaccount.setNoOfMonth(noOfMonths);
				System.out.println("Enter your age:");
				age=s.nextInt();
				while(age<0) {
					System.out.println("Invalid Age. Please enter non-negative values.");
					System.out.println("Enter your age:");
					age=s.nextInt();
				}
				rdaccount.setAgeOfACHolder(age);
				System.out.println("Interest gained: Rs. "+rdaccount.calculateInterest());
				break;
			case 4:
				System.out.println("Thank You for using interest calculator.");
				break;
            default:
            	break;
			}
		}while(!(choice==4));
		s.close();
	}

}
