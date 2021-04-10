package com.main;

import java.util.List;


import com.DAO.CarDAO;
import com.bean.Car;

public class CarMain {
	public static void main(String[] args) {
		CarDAO dao=new CarDAO();
		List<Car> result=dao.getCarDetails();
		
		for(Car obj:result) {
			System.out.println("Manufacturer name: "+obj.getManufacturer());
		}

	}

}
