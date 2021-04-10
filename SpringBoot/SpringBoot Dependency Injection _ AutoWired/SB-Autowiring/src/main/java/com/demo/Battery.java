package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	private double chargePower;
	private double battery;
	
	public double getChargePower() {
		return chargePower;
	}
	public void setChargePower(double chargePower) {
		this.chargePower = chargePower;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public void display() {
		System.out.println("Got Battery Object");
	}

}
