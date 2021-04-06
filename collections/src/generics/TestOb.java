package generics;

public class TestOb {
	public static void main(String[] args) {
		Gen<String> g1 = new Gen<String>("Naik");
		g1.show();
		System.out.println(g1.getOb());
		
		Gen<Integer> g2 = new Gen<Integer>(26);
		g2.show();
		System.out.println(g2.getOb());
		
		Gen<?> g3 = new Gen<String>("Naik");
		g3.show();
		System.out.println(g3.getOb());
		
		Gen<? super String> g4 = new Gen<Object>("Amit");
		g4.show();
		System.out.println(g4.getOb());
		
		Gen<? extends Number> g5 = new Gen<Integer>(59);
		g5.show();
		System.out.println(g5.getOb());
		
		
		
		Test<MyNumber> t1 = new Test<MyNumber>(new MyNumber(), new MyNumber());
		}

}
