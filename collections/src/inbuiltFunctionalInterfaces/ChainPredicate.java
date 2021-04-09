package inbuiltFunctionalInterfaces;

import java.util.function.Predicate;

public class ChainPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2 == 0;
		Predicate<Integer> p2 = i -> i >= 0;
		int[] intArray = {15,4,6,95,10,45};
		
		System.out.println("if no>10 and if it is even then print it ");
		
		for(int i : intArray) {
			if(p1.and(p2).test(i)) {
				System.out.println(i); //if no >10 and if it is even then print it
			}
		}


		System.out.println("if no >10 or if it is an even no then print it");

		for(int i : intArray) {

			if(p1.or(p2).test(i)) {

				System.out.println(i); //if no >10 or  if it is even then print it
			
			}
		}
	}
}
