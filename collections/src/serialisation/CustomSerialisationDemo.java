package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialisationDemo {
	public static void main(String[] args) throws Exception {
		
		Account acc = new Account();
		
		FileOutputStream fos = new FileOutputStream("account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		
		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc2 = (Account) ois.readObject();
		System.out.println("username = "+acc2.userName+" password= "+acc2.password);
	
}
}
