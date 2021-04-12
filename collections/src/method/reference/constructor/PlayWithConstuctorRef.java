package method.reference.constructor;

public class PlayWithConstuctorRef {
	public static void main(String[] args) {
		ISample iSample = Sample::new;
		Sample s1 = iSample.get("naik");
	}

}
