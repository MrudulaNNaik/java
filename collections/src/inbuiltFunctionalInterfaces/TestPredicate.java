package inbuiltFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;


public class TestPredicate {
	static public ArrayList<Employee> employees;
	public static void main(String[] args) {
	//Predicate<Integer> p = i -> i % 2 == 0;
		//System.out.println(p.test(10));
		populateEmployees();
	
			Predicate<Employee> p1 = (e) -> e.salary >= 10000;
	for(Employee e : employees) {
		if(p1.test(e)) {
			System.out.println(e.name);
		}
	}
		
	}
	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("abi",23344));
		employees.add(new Employee("poorna",50000));
		employees.add(new Employee("amit",8000));
		employees.add(new Employee("ajit",2400));
		employees.add(new Employee("naik",30000));
		
		
	}
	

}
