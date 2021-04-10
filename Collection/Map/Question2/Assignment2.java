/* Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Assignment2 {
	
	public static void main(String args[]) {
		
		HashMap<String,String> h=new HashMap<String,String>();
		
		h.put("key1","value1");
		h.put("key2","value2");
		h.put("key3","value3");
		Set<Entry<String,String>> set=h.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			if(me.getKey().equals("key1")) {
				System.out.println("Particular key exist");
				break;
			}

		}
		
		set=h.entrySet();
		it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			if(me.getValue().equals("value1")) {
				System.out.println("Particular value exist");
				break;
			}
		
		}
		
		set=h.entrySet();
		it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			System.out.println(me);
		}
		
	}

}
