package fileio;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\MRUDULA N NAIK\\Documents\\ELECTROBLAST\\text");    
            fout.write(65);    
            fout.close();    
            System.out.println("success...");    
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
