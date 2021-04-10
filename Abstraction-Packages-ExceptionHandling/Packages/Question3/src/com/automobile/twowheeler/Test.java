package com.automobile.twowheeler;

public class Test {
	public static void main(String args[]) {
		Hero hero=new Hero("Glamour125","WB1GG1234","Bob Biswas",85);
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println("Speed is:"+hero.getSpeed());
	    hero.radio();
		Honda honda=new Honda("Honda City","WB18G7777","Prodosh Mitra",110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println("Speed is:"+honda.getSpeed());
		honda.cdplayer();
	}

}
