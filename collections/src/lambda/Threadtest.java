package lambda;

public class Threadtest {
	public static void main(String[] args) {
		Myrunnable r = new Myrunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
