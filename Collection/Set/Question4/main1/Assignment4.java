/* Implement the assignment 1 using TreeSet*/
package main1;

import bean1.Country;

public class Assignment4 {
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
