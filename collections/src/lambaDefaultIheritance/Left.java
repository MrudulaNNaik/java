package lambaDefaultIheritance;

public interface Left {
	public default void m2() {
		System.out.println("left interface");
	}

}
