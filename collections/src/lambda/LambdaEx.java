package lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		int sq4 = squareIt(4);
		System.out.println(sq4);
		
		Function<Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(5));
		
	}

	public static int squareIt(int i) {
		return i*i;
	}

}
