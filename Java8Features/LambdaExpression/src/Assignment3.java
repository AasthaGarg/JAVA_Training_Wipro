
import java.util.List;
import java.util.ArrayList;

interface iface{
	boolean oddString(String str);
}
public class Assignment3 {
	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
		arr.add("Ram");
		arr.add("Mohan");
		arr.add("Sahil");
		arr.add("Manu");
		arr.add("Mohit");
		arr.add("Nanu");
		arr.add("Sanjay");
		arr.add("Preeti");
		arr.add("Shanti");
		arr.add("Priya");
		iface i1=(obj)->{
			int len=obj.length();
			if(len%2==0) {
				return false;
			}
			return true;
		};
		arr.forEach(n->{
			if(i1.oddString(n))
				System.out.println(n);
		});
	}

}
