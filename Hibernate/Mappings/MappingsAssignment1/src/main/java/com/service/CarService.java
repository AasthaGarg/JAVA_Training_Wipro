package com.service;

import com.DAO.CarOwnerDAO;
import com.bean.Car;
import com.bean.CarOwner;

public class CarService {
	public static void main(String[] args) {
		Car car=new Car("KL-44","AC 234 Vento","Red","Toyota");
		CarOwner carowner=new CarOwner(120,"Saket",car);
		CarOwnerDAO dao=new CarOwnerDAO();
		System.out.println("Result: "+dao.insertDetails(carowner));
	}

}
