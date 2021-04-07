package serialisation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalisation implements Externalizable {
	String s;
	int i,j;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("Naik");
		out.writeInt(25);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.s = (String) in.readObject();
		this.i = in.readInt();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalisation extrn = new Externalisation();
		FileOutputStream fos = new FileOutputStream("externalisationdemo");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(extrn);
		
		FileInputStream fis = new FileInputStream("externalisationdemo");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalisation extrn2 = (Externalisation) ois.readObject();
		
		System.out.println("i="+extrn2.i+" j="+extrn2.j+" s="+extrn2.s);
		
	}
	

}
