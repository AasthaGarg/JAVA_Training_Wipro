import java.util.ArrayList;
import java.util.List;


interface StringFunc{
	String func(String s);
}
public class Assignment2 {
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
		StringFunc reverse=(str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		};
		arr.forEach(n->System.out.println(reverse.func(n)));
	}
	

}
