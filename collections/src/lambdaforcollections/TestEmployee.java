package lambdaforcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("amit",1225));
		employees.add(new Employee("divya",5698));
		employees.add(new Employee("mohan",5876));
		employees.add(new Employee("lalit",8965));
		employees.add(new Employee("arpit",5632));
		System.out.println(employees);
	
		
		//sort employee based on id
		Comparator<Employee> e = (e1,e2) -> (e1.id < e2.id)? -1:(e1.id > e2.id)?1: 0;
		Collections.sort(employees,e);
		System.out.println("sort employee based on id");
		System.out.println(employees);
		Collections.sort(employees ,new NewComp());
		
		Comparator<Employee> n = (e1,e2) -> (e1.name.compareTo(e2.name));
		Collections.sort(employees,n);
		System.out.println("sort employee based on name");
		System.out.println(employees);
		
		
	
		 
		
		
		
	}

}
