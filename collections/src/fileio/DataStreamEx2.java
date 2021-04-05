package fileio;

import java.io.FileInputStream;

public class DataStreamEx2 {
	public static void main(String[] args) {
		 try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\MRUDULA N NAIK\\Documents\\ELECTROBLAST\\text");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	}

}
