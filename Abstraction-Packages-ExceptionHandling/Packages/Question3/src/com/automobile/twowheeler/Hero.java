package com.automobile.twowheeler;
import com.automobile.*;
public class Hero extends Vehicle {
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	public Hero(String modelName,String registrationNumber,String ownerName,int speed){
		super();
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
	}
	public String getModelName() {
		return "Hero model name:"+modelName;
	}
	public String getRegistrationNumber() {
		return "Hero registration number: "+registrationNumber;
	}
	public String getOwnerName() {
		return "Hero owner name: "+ownerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void radio() {
		System.out.println("Accessing the Radio");
	}
    
}
