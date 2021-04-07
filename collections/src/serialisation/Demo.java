package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) throws Exception {
		Cow cow =  new Cow();
		cow.i = 45;
		cow.j = 89;
		cow.k = 9;
		
		FileOutputStream fos = new FileOutputStream("inherit.txt");
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		oos.writeObject(cow);
		
		FileInputStream fis = new FileInputStream("inherit.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cow cow2 = (Cow)ois.readObject();
		System.out.println("Cow variables i="+cow2.i+" j="+cow2.j+" k = "+cow2.k);
		
		
		
	
}

}
