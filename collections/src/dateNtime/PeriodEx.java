package dateNtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1999, 04, 25);
		Period period = Period.between(dob, today);
		LocalDate lastDay = dob.plusYears(16);
		Period periodLeft = Period.between(today, lastDay);
		
		System.out.printf("no of years = %d, no of months = %d, no.of days = %d", period.getYears(),period.getMonths(),period.getDays());
		System.out.printf("\n no of yeras left = %d,  no of months = %d, no.of days = %d",periodLeft.getYears(),periodLeft.getMonths(),periodLeft.getDays() );

		}

}
