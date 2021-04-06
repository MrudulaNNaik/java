package dateNtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDebug {
	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		int day = l1.getDayOfMonth();
		
		LocalDateTime l2 = LocalDateTime.now();
		int c = add(12,23);
		LocalTime lTime = LocalTime.now();
		System.out.println(lTime.plusMinutes(59));
	
		
	
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}


}
