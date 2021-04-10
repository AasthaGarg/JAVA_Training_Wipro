/* Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.*/
package main;

import bean.Country;
public class Assignment1 {
	public static void main(String args[]) {
		Country country=new Country();
		country.saveCountryName("India");
		country.saveCountryName("UK");
		country.saveCountryName("China");
		country.saveCountryName("Pakistan");
		System.out.println("China: "+country.getCountryName("China"));
		System.out.println("Japan: "+country.getCountryName("Japan"));
	}

}
