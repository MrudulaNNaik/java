package method.reference;

import java.util.Iterator;

public class PlayMethodReference {
	public static void main(String[] args) {
		/*Runnable r =() -> { for (int i =0; i<5; i++)
			{System.out.println("in child thread");
			}
			};
		
	Thread t = new Thread(r);
	t.start();
	
		
	}*/
	
		
		Runnable r = PlayMethodReference::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i =0; i<5; i++) {
			System.out.println("in main thread");
		}
		}
	
	public static void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("im from m1 method");
			
		}
		
	}
	

}
