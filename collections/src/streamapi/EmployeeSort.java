package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<Employee> emplList = new ArrayList<Employee>();
		emplList.add(new Employee("naik", 43) );
		emplList.add(new Employee("poorna", 59) );
		emplList.add(new Employee("madhu",39) );
		emplList.add(new Employee("yashu", 51) );
		emplList.add(new Employee("anu", 8) );
		
		System.out.println(emplList);
		//List<Employee> sortedList = emplList.stream().sorted().collect(Collectors.toList())	;	
		
		Comparator<Employee> c = (e1,e2) -> { return (e1.id < e2.id)? -1 :
			(e1.id > e2.id)? 1:
				0;
		};
		List<Employee> sortedList = emplList.stream().sorted(c).collect(Collectors.toList())	;	
		
		
		
		System.out.println(sortedList);
		
	}

}

