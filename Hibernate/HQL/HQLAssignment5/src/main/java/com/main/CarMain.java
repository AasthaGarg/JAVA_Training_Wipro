package com.main;

import java.util.List;
import java.util.Scanner;

import com.DAO.CarCriteria;
import com.bean.Car;

public class CarMain {
	public static void main(String[] args) {
		CarCriteria dao=new CarCriteria();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color");
		String color=sc.next();
		List<Car> result=dao.getCarDetails(color);
		System.out.println("Car Details:");
		for(Car carobj:result) {
			System.out.println(carobj);
		}
		sc.close();
	}

}
