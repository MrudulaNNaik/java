package dateNtime;

public class UTILtest {
	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();  
		System.out.println(date);  
		
		//using millis
		long millis=System.currentTimeMillis();  
		java.util.Date date1=new java.util.Date(millis);  
		System.out.println(date1);  
	}

}
