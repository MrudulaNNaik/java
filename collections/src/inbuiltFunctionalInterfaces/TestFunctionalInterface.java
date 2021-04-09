package inbuiltFunctionalInterfaces;

import java.util.function.Function;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(2));
		
		Function<String,Integer> f2 = s -> s.length();
		System.out.println("length of naik is "+f2.apply("naik"));
		
			
 		
	}

}
