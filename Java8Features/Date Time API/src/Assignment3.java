import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Assignment3 {
	public static void main(String[] args) {
		LocalDate startDate=LocalDate.of(2020, Month.MARCH, 12);
		LocalDate todayDate=LocalDate.now();
		long noOfDays=ChronoUnit.DAYS.between(startDate, todayDate);
		long noOfMonths=ChronoUnit.MONTHS.between(startDate, todayDate);
		long noOfYears=ChronoUnit.YEARS.between(startDate, todayDate);
		System.out.println("Experienced in wipro years: "+noOfYears+" months: "+noOfMonths+" days: "+noOfDays);
	}

}
