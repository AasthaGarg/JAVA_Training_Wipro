package com.main;

import java.util.List;
import java.util.Scanner;

import com.DAO.CarDAO;
import com.bean.Car;

public class CarMain {
	public static void main(String[] args) {
		CarDAO dao=new CarDAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter registration no. of the car: ");
		String regno=sc.next();
		List<Car> result=dao.getCarDetails(regno);
		System.out.println("Car Details");
		for(Car obj:result) {
			System.out.println(obj);
		}
		sc.close();
	}

}
