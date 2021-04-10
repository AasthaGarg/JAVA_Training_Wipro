package com.automobile.fourwheeler;

public class Main {
	public static void main(String args[]) {
		Logan logan=new Logan("Logan ABC","WWEeer","Bob Biswas",220,1);
		System.out.println(logan.getModelName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getOwnerName());
		System.out.println("Speed is:"+logan.speed());
		System.out.println("Has GPS? "+logan.gps());
		Ford ford=new Ford("Ford XYZ","wwe345w","Alice",300,1);
		System.out.println(ford.getModelName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getOwnerName());
		System.out.println("Speed is:"+ford.speed());
		System.out.println("Has temp. control? "+ford.tempControl());
	}

}
