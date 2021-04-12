package streamapi;

public class Employee{ 
// implements Comparable<Employee> {
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.id;
	} 
	
	//@Override
	//public int compareTo(Employee o) {
		//return (this.id  > o.id)? 1
			//	: (this.id < o.id)?-1 : 0;
	//}
	
	

}
