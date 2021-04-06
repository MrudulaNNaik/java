package generics;

import java.util.ArrayList;

public class FirstEx {
	public static void main(String[] args) {
		String[] students = new String[3];
		students[0] = "mrudula";
		//students[1] = 10;
		students[1] = "amit";
		
		String name = students[0];
		
		
		ArrayList studentsList = new ArrayList();
		studentsList.add("mrudula");
		studentsList.add("amit");
		//studentsList.add(new Integer (10));
		
		System.out.println(studentsList);
		
		String name1 = (String) studentsList.get(1);
		System.out.println(name);
	
	
	}

}
