package inbuiltFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Pass {
	static public ArrayList<Student> students;
	public static void main(String[] args) {
		checkStatus();
		
		Predicate<Student> m = (s) -> ( s.marks1+ s.marks2+ s.marks3) < 75;
		for(Student s : students) {
			System.out.println(m.test(s)? "fail":"pass");
		}
			
	} 
	
	private static void checkStatus() {
		students = new ArrayList<Student>();
		students.add(new Student("a",23,12,34));
		students.add(new Student("b",4,5,7));
		students.add(new Student("c",36,48,12));
		students.add(new Student("e",86,25,14));
	}

}
