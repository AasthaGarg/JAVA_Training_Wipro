/* Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.*/
import java.util.TreeSet;
import java.util.Iterator;
public class Assignment3 {
	public static void main(String args[]) {
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("obj 1");
		set.add("obj 2");
		set.add("obj 3");
		
		Iterator<String> it=set.descendingIterator();
		
		System.out.println("Reverse order of elements are:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> it1=set.iterator();
		System.out.println("On iterating elements are:");
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Iterator<String> it2=set.iterator();
		String query="obj 4";
		boolean result=false;
		while(it2.hasNext()) {
			if(it2.next().equals(query)) {
				result=true;
				break;
			}
		}
		System.out.println("Checking if "+query+" exist");
		System.out.print("Result: ");
		if(result) System.out.print(query+" exists.");
		else System.out.print(query+" doesn't exist.");
	}

}
