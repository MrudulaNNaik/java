package lambaDefaultIheritance;

public class TestDefaultInheritance implements Left,Right {

	@Override
	public void m2() {
		Left.super.m2();
		//Right.super.m1();
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		TestDefaultInheritance tdi = new TestDefaultInheritance();
		tdi.m2();
		tdi.m1();
	}
	
	

	
	
	

}
