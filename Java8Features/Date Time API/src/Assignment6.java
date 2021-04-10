import java.time.LocalTime;

public class Assignment6 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println("Current time: "+time);
		System.out.println("Time before 5 hours and 30 minutes: "+time.minusHours(5).minusMinutes(30));
	}

}
