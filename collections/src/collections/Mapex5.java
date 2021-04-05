package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mapex5 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"Ajit");
		m.put(2,"Amit");
		m.put(3,"Seema");
		m.put(4,"Babu");
		
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}

