import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Assignment2 {
	public static void main(String[] args) {
		LocalDate todayDate=LocalDate.now();
		LocalDate date=todayDate.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		System.out.println(date);
	}

}
