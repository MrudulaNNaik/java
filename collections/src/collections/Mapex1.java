package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapex1 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"abc");
		map.put(2,"def");
		map.put(3,"hij");
	for(Entry<Integer, String> m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());  
		
	}
	}
	

}
