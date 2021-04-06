package dateNtime;

import java.time.LocalDate;

public class TestDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tmrw = date.plusDays(1);
		System.out.println("today date "+date );
		System.out.println("yesterday date "+yesterday);
		System.out.println("tmrw date " +tmrw);
	}

}
