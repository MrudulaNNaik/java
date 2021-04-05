package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ConcurrentDemo {
	static Vector<String> arrayList = new Vector<String>();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		arrayList.add("some");
	}
	
	public static void main(String[] args) throws InterruptedException  {
		arrayList.add("A");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		
		ConcurrentDemo concurrentDemo = new ConcurrentDemo();
		concurrentDemo.start();
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			
			Thread.sleep(6000);
		}
		System.out.println(arrayList);
		
		
	}

	
	
}
