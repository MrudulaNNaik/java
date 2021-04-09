
package inbuiltFunctionalInterfacesBiparams;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import inbuiltFunctionalInterfaces.JavaStudent;
import inbuiltFunctionalInterfaces.StudentTest;


public class BiConsumerTest {
	public static void main(String[] args) {
		ArrayList<JavaStudent> javaStudents = StudentTest.populateStudents();
		BiConsumer<JavaStudent, Integer> bic = (j,i) -> j.marks += 10;
		
	
	    for(JavaStudent j : javaStudents) {
	    	bic.accept(j, 10);
	    	System.out.println(j.name+"\t"+j.marks);
	}
}
}
	
