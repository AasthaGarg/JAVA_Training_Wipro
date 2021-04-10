import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Assignment3 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("MoM");
		list.add("NamaN");
		list.add("Pihu");
		list.add("MadaM");
		list.add("Sakshi");
		list.add("TajaT");
		list.add("Barkha");
		list.add("papa");
		list.add("SaaS");
		list.add("PooP");
		
		Predicate<String> p1=x->{
			StringBuilder reverse=new StringBuilder(x).reverse();
			return (reverse.toString()).equals(x);
		};
		list.stream().filter(p1).forEach(System.out::println);
		
		
	}

}
