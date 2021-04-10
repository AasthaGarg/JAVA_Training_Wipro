package com.automobile.fourwheeler;
import com.automobile.*;
public class Logan extends Vehicle{
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int gps;
	public Logan(String modelName,String registrationNumber,String ownerName,int speed,int gps){
		super();
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
		this.gps=gps;
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
	public int speed() {
		return speed;
	}
	public int gps() {
		return gps;
	}

}
