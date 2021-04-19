package inbuiltFunctionalInterfacesBiparams;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class CheckEligibility {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Pupil> bif = (a,m) -> new Pupil("Naik", a,m);
		
		Pupil pupil = bif.apply(19,82);
		BiPredicate<Integer,Integer> bip1 = (age,marks) -> (age >= 18);
		BiPredicate<Integer,Integer> bip2 = (age,marks) -> (marks > 60);
		if (bip1. and (bip2).test(pupil.age, pupil.marks)) {
		System.out.println("Eligible"); 
		}
		else {
		System.out.println("not eligible");
		}
			
	}

}
