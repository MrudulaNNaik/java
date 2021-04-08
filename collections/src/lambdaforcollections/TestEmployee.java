package lambdaforcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("amit",1225));
		employees.add(new Employee("divya",5698));
		employees.add(new Employee("mohan",5876));
		employees.add(new Employee("lalit",8965));
		employees.add(new Employee("arpit",5632));
		System.out.println(employees);
		Comparator<Employee> e = (e1,e2) -> (e1.id < e2.id)? -1:(e1.id > e2.id)?1: 0;
		Collections.sort(employees,e);
		// Collections.sort(employees ,new NewComp());
		System.out.println(employees);
		
		
	}

}
