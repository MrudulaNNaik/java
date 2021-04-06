package dateNtime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {
	public static void main(String[] args) {
		Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d.get(ChronoUnit.SECONDS)); 
	    System.out.println("--------");
	    
	    Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
	      System.out.println(d1.isNegative());  
	      Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	              System.out.println(d2.isNegative());  
	              System.out.println("--------");
	              
	     Duration d3 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	     System.out.println(d3.getSeconds());  
	     Duration d4 = d1.minus(d1);  
	     System.out.println(d4.getSeconds());             
	             
	}

}
