package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayMap {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(47);
		marks.add(50);
		marks.add(91);
		marks.add(60);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		List<Integer> evenNumbers = marks.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
		
		}

}
