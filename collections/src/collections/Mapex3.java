package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mapex3 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"Ajit");
		map.put(2,"Amit");
		map.put(3,"Seema");
		map.put(4,"Babu");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
