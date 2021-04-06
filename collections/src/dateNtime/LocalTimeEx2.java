package dateNtime;

import java.time.LocalTime;

public class LocalTimeEx2 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(12,40,48);
		System.out.println(time);
		 System.out.println("------------");
		
		LocalTime time1 = LocalTime.of(15, 02, 12);
		LocalTime time2 = time1.minusHours(2);
		LocalTime time3 = time1.minusMinutes(21);
		 System.out.println(time1);
		 System.out.println(time2);
		 System.out.println(time3);
		 System.out.println("------------");
		
		 LocalTime time4 = LocalTime.of(10,43,12);    
		    LocalTime time5 = time4.plusHours(4);  
		    LocalTime time6=time4.plusMinutes(18);  
		    System.out.println(time4);
		    System.out.println(time5);
		    System.out.println(time6);
	}
}
