package inbuiltFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {
	static ArrayList<JavaStudent> javaStudents;
	
	public static void main(String[] args) {
		populateStudents();
		Function<JavaStudent,String> f = (j) -> {
			if(j.marks > 80) return "Distinction";
			else if(j.marks > 60) return "first class";
			return "pass class";
		};

		for(JavaStudent s : javaStudents) {

			System.out.println(s.name +"\t"+ f.apply(s));
		}
	}

	private static void populateStudents() {
		javaStudents = new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent("a",80));
		javaStudents.add(new JavaStudent("b",60));
		javaStudents.add(new JavaStudent("c",50));
		javaStudents.add(new JavaStudent("d",90));
		javaStudents.add(new JavaStudent("e",89));
		
	}
}
	

