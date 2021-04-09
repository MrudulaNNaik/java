package inbuiltFunctionalInterfacesBiparams;

import java.util.function.BiPredicate;

public class TestPredicate {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a,b) -> (a+b) % 2 == 0;
		
		System.out.println(bp.test(10,30));
		System.out.println(bp.test(10,85));
	}

}
