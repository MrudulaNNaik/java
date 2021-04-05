package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapex4 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"Ajit");
		m.put(2,"Amit");
		m.put(3,"Seema");
		m.put(4,"Babu");
		
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
	}

}
