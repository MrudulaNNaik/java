package streamapi;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	int salary;
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.id + " "+ this.salary;
	} 
	
	@Override
	public int compareTo(Employee o) {
		return (this.salary  > o.salary)? -1
				: (this.salary < o.salary)? 1 : 0;
	}
	
	

}
