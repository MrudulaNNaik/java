package lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		
		//FuncInterface fi = () -> System.out.println("hello");
		//fi.m1();
		
	 ISum s = (int a,int b)-> (a+b); 
	 System.out.println(s.add(10, 52));
		
	}

	public static int squareIt(int i) {
		return i*i;
	}

}
