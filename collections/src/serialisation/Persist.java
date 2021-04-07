package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) {
		try {
			  Student s1 =new Student(22,"naik"); 
			  
			  FileOutputStream fos = new FileOutputStream("dxc.txt");
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(s1);
			  oos.flush();
			  System.out.println("done");
			  
			
		} catch (Exception e) { System.out.println(e);
			// TODO: handle exception
		}
		
		try {
			FileInputStream fin = new FileInputStream("dxc.txt");
			ObjectInputStream is = new ObjectInputStream(fin);
			
			Student s2 = (Student)is.readObject();
			System.out.println(s2.age+" "+s2.name);
			
		} catch ( Exception e) { System.out.println(e);
			// TODO: handle exception
		}
	}

}
