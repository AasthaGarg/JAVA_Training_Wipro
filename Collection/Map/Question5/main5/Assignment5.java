/*Implement the assignment 1 using TreeMap */
package main5;


import java.util.TreeMap;
import bean5.Country;
public class Assignment5 {
	public static void main(String args[]) {
		Country country=new Country();
		
		country.saveCountryCapital("India", "Delhi");
		country.saveCountryCapital("Japan", "Tokyo");
		
		String countryName="India";
		System.out.println(countryName+" capital is "+country.getCapital(countryName));
		
		String capitalName="Tokyo";
		System.out.println(capitalName+" is capital of "+country.getCountry(capitalName));
		
		TreeMap<String,String> h=country.swapKeyValue();
		System.out.println("After swapping: ");
		System.out.println(h);
		
		System.out.println("Array list is: "+country.toArrayList());
	}

}

