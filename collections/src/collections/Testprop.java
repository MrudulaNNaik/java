package collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Testprop {
	public static void main(String[] args) {
		Properties p = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\MRUDULA N NAIK\\git\\repository\\collections\\db.propertes");
			 	p = new Properties();
			 	p.load(reader);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}

}
