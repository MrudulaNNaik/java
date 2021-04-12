package method.reference.constructor;

public class PlayStudent {
	//IStudent is = (name,age,roll,marks) -> new Student("naik", 10, 15, 85);
    
	public static void main(String[] args) {
		IStudent i = Student::new;
		Student s1 = i.get("naik", 10, 15, 85);
	}
}
