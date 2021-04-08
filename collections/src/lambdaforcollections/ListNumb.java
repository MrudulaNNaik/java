package lambdaforcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListNumb {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(12);
		a1.add(36);
		a1.add(89);
		a1.add(96);
		a1.add(75);
		System.out.println(a1);
		Comparator<Integer> r = (o1,o2) -> (o1 < o2)? -1: (o1 > o2)? 1: 0;
				//Collections.sort(a1,new MyComaprator());
		Collections.sort(a1,r);
		System.out.println(a1);
		}

}
