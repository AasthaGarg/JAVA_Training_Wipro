import java.time.LocalTime;

public class Assignment5 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println("Current time is: "+time);
		System.out.println("Time after 25 minutes: "+time.plusMinutes(25));
	}

}
