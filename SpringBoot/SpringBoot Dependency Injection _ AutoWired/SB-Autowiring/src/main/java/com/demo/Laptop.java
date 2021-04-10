package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int displaySize;
	private String company;
	@Autowired
	private HardDisk hardDisk;
	@Autowired
	private Battery battery;
	
	public int getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public void display() {
		System.out.println("Got Laptop Object");
		hardDisk.display();
		battery.display();
	}
	
	

}
