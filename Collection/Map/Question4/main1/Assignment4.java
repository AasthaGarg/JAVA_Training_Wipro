/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/
package main1;
import bean1.ContactList;


public class Assignment4 {
	public static void main(String args[]) {
		ContactList cl=new ContactList();
		cl.addContact("Lakhi", 1234567890);
		cl.addContact("Mahi", 345671239);
		cl.addContact("Sonu", 4356892);
		
		System.out.println("Lakhi: "+cl.doesNameExist("Lakhi"));
		System.out.println("1234567890: "+cl.doesNumbereExist(1234567890));
		
		System.out.println();
		cl.listAllContacts();
		
	}

}
