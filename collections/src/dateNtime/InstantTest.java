package dateNtime;

import java.time.*;

public class InstantTest {
	public static void main(String[] args) {
		 Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
		 System.out.println(inst);  
		 
		 Instant instant = Instant.now();  
		 System.out.println(instant);  
		 
		Instant instnt = Instant.parse("2017-02-03T11:25:30.00Z");  
	    instnt = instnt.minus(Duration.ofDays(125));  
	    System.out.println(instnt);    
		    
		Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");  
	    Instant inst2 = inst1.plus(Duration.ofDays(125));  
	    System.out.println(inst2);   
	}
	

}
