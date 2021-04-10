import java.util.StringJoiner;

public class Assignment2 {
	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-");
		s1.add("Meerut");
		s1.add("Delhi");
		s1.add("Noida");
		StringJoiner s2=new StringJoiner("-");
		s2.add("Pathankot");
		s2.add("Banglore");
		s2.add("Hyderabad");
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));
	}

}
