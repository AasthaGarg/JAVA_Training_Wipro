package com.automobile.twowheeler;
import com.automobile.*;
public class Honda extends Vehicle{
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	public Honda(String modelName,String registrationNumber,String ownerName,int speed){
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
	public void cdplayer() {
		System.out.println("Accessing the CDplayer");
	}

}
