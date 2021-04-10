import java.util.Optional;

public class Assignment1 {
	
	public static void main(String[] args) {
		String names[]=new String[5];
		Optional<String> n=Optional.ofNullable(names[0]);
		if(n.isPresent()) {
			System.out.println(names[0].length());
		}
		else {
			System.out.println("Null values");
		}
	}	

}
