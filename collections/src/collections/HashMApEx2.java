package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMApEx2 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		   map.put(1,"Mango"); 
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); 
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
	}

}
