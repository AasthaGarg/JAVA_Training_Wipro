package com.main;

import java.util.List;
import java.util.Scanner;

import com.DAO.CarCriteria;
import com.bean.Car;

public class CarMain {
	public static void main(String[] args) {
		CarCriteria dao=new CarCriteria();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter registration no.");
		String regno=sc.next();
		int result=dao.getCarDetails(regno);
		System.out.println("Total count of cars "+result);
		sc.close();
	}

}
