import java.util.Optional;

public class Assignment2 {
	String address;
	String default_address="India";
	public static void main(String[] args) {
		Assignment2 obj =new Assignment2();
		Optional<String> n=Optional.ofNullable(obj.address);
		System.out.println(n.orElse(obj.default_address));
	}

}
