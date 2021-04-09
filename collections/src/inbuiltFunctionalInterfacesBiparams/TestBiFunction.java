package inbuiltFunctionalInterfacesBiparams;

import java.util.function.BiFunction;

public class TestBiFunction {
	public static void main(String[] args) {
		BiFunction<Integer, String, Emp> bif = (i,s) -> new Emp(s,i);
		
		Emp e = bif.apply(7894,"naik");
		System.out.println(e.name);
	}

}
