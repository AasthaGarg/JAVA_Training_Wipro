package com.automobile.fourwheeler;
import com.automobile.*;
public class Ford extends Vehicle{
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int tempControl;
	public Ford(String modelName,String registrationNumber,String ownerName,int speed,int tempControl){
		super();
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
		this.tempControl=tempControl;
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
    public int tempControl() {
    	return tempControl;
    }
}
