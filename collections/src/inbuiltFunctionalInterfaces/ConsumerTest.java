package inbuiltFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {
	static ArrayList<JavaStudent> javaStudents = StudentTest.populateStudents();
	
	public static void main(String[] args) {
		Consumer<JavaStudent> c= s -> System.out.println(s.name);
		Predicate<JavaStudent> p = s -> s.marks >= 70;
		
		System.out.println();
		for(JavaStudent student: javaStudents){
			c.accept(student);
			
		}
	}
}
