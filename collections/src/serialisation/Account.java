package serialisation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	String userName = "Mrudula";
	transient String password = "NAIK";
	
	private void writeObject(ObjectOutputStream oos ) throws ClassNotFoundException,IOException{
	 oos.writeUTF("123" +userName+","+"456" +password);	
	
	}
	
	private void readObject(ObjectInputStream ois) throws IOException {
		String[] unpwd = ois.readUTF().split(",");
		this.userName = unpwd[0].substring(3);
		this.password = unpwd[1].substring(3);
		
		
	}
}
