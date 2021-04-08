package lambdaforcollections;

public class Employee {
	String name;
	int id;
	
	public Employee ( String string, int i)
	{
		name = string;
		id = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+name;
		// return super.toString();
	}

}
