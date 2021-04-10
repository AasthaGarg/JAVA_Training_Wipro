import java.time.LocalDate;

public class Assignment1 {
	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		System.out.println("Today Date: "+todayDate);
		System.out.println("Date after 10 days: "+todayDate.plusDays(10));
	}

}
