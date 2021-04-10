
import java.util.List;
import java.util.ArrayList;

public class Assignment1 {
	public static void main(String[] args) {
		List<String> arr=new ArrayList<String>();
		arr.add("Sunday");
		arr.add("Monday");
		arr.add("Tuesday");
		arr.add("Wednesday");
		arr.add("Thursday");
		arr.add("Friday");
		arr.add("Saturday");
		arr.forEach(System.out::println);
	}
	

}
