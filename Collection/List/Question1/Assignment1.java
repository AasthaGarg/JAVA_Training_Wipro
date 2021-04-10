/* Write a Java program to create an ArrayList, add all the months of a year and print the same.*/

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		Iterator<String> it=al.iterator() ;
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}

