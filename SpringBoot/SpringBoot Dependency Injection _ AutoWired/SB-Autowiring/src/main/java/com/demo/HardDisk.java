package com.demo;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	
	private String brand;
	private String modelNo;
	private double size;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public void display() {
		System.out.println("Got HardDisk Object");
	}
}
