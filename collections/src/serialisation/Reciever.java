package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Reciever {
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream fis = new FileInputStream("zoo.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);

	Tiger tiger = (Tiger)ois.readObject();
	System.out.println("Tiger variables are"+tiger.a);

	
		
	}

}
