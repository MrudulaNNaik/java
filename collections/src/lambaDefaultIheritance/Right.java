package lambaDefaultIheritance;

public interface Right {
	public default void m1() {
		System.out.println("right interface");
	}

}
