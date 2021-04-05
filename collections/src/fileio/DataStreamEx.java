package fileio;

import java.io.FileInputStream;

public class DataStreamEx {
	   public static void main(String args[]){    
	          try{    
	            FileInputStream fin=new FileInputStream("C:\\Users\\MRUDULA N NAIK\\Documents\\ELECTROBLAST\\text");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    

}
