/*Write a program that will have a Properties class object which is capable of storing some States of India and 
 * their Capital. Use an Iterator to list all the elements stored in the Properties.*/

import java.util.Properties;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class Assignment3 {
	public static void main(String args[]) {
		Properties p =new Properties();
		p.setProperty("West Bengal", "Kolkata");
		p.setProperty("Rajasthan", "Jodhpur");
		p.setProperty("Bihar", "Patna");
		
		Set<Entry<Object,Object>> set=p.entrySet();
		Iterator<Entry<Object,Object>> it=set.iterator();
		
		while(it.hasNext()) {
			Entry<Object,Object> me=it.next();
			System.out.println(me);
		}
	}

}
