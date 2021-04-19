package method.reference.constructor;

public class Student {
	String name;
	int age, roll, marks;
	public Student(String name, int age, int roll, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.roll = roll;
		this.marks = marks;
		System.out.println("student object created "+this.name);

		
	}
	
	
	

}
