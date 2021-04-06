package generics;

public class Test<T extends Number & Runnable> {
	
	T m,n;
	
	public Test(T m,T n) {
		this.m = m;
		this.n = n;
	
	}
	
	

	public void ArithmeticOperation() {
		System.out.println();
		
	}

}
