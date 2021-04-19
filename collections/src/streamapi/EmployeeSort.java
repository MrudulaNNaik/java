package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<Employee> emplList = new ArrayList<Employee>();
		emplList.add(new Employee("naik", 43, 4587) );
		emplList.add(new Employee("poorna", 59, 5022) );
		emplList.add(new Employee("madhu",39, 1255) );
		emplList.add(new Employee("yashu", 51, 4562) );
		emplList.add(new Employee("anu", 8, 2548) );
		
		System.out.println(emplList);
		//List<Employee> sortedList = emplList.stream().sorted().collect(Collectors.toList())	;	
		
		Comparator<Employee> c = (e1,e2) -> { return (e1.id < e2.id)? -1 :
			(e1.id > e2.id)? 1:
				0;
		};
		List<Employee> sortedList = emplList.stream().sorted(c).collect(Collectors.toList())	;	
		System.out.println(sortedList);
		
		//Employee salmax = emplList.stream().max((e1,e2) -> e2.compareTo(e1)).get();
		//System.out.println("Employee with max salary: " +salmax.toString());
		
		//Employee salmin = emplList.stream().min((e1,e2) -> e2.compareTo(e1)).get();
		//System.out.println("Employee with min salary: " + salmin.toString());
		
		sortedList.forEach(System.out::println);
		
		Employee[] employees = (Employee[]) sortedList.stream().toArray();
		
	    
	}

}

