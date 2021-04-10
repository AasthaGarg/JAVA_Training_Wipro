package bean1;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;

public class ContactList {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
	public void addContact(String name,Integer number) {
		hm.put(name, number);
	}
	
	public void removeContact(String name) {
		hm.remove(name);
	}
	
	@Override
	public String toString() {
		return "ContactList [contact= "+hm+"]";
	}
	
	public boolean doesNameExist(String name) {
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,Integer> me=it.next();
			if(me.getKey().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean doesNumbereExist(Integer number) {
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,Integer> me=it.next();
			if(me.getValue().equals(number)) {
				return true;
			}
		}
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,Integer> me=it.next();
			System.out.println(me);
		}
	}

}
