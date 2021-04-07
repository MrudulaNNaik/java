package serialisation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InstanceEx {
	public static void main(String[] args) throws Exception  {
		FileInputStream fis  = new FileInputStream("dxc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ois.close();
		
		if(o instanceof Cat) {
			Cat c1 = (Cat)o;
			System.out.println("cat");
		}
		else if(o instanceof Dog) {
			Dog d1 = (Dog)o;
			System.out.println("dog");
			
		}
		else if(o instanceof Rat) {
			Rat r1 = (Rat)o;
			System.out.println("rat");
			}
		}

}
