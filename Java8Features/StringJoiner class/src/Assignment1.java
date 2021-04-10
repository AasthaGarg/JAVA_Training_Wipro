import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Assignment1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mohan");
		list.add("Sami");
		list.add("Parul");
		StringJoiner s1=new StringJoiner(",","{","}");
		list.forEach(element->s1.add(element));
		System.out.println(s1);
	}

}
