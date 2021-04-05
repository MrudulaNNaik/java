package fileio;

import java.io.FileWriter;

public class FileWriterEx {
	
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("C:\\Users\\MRUDULA N NAIK\\Desktop\\Dxc");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    

}
