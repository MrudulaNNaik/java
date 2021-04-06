package dateNtime;

import java.sql.Date;

public class SqlTest {
	public static void main(String[] args) {
		long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        System.out.println(date);
        
        
      //converting string into sql dat
        String str="2015-03-31";  
        Date date1 = Date.valueOf(str);  
        System.out.println(date);  
    }  
	

}
