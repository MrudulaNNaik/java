package fileio;

import java.io.FileReader;

public class FileReaderEx {
	 public static void main(String args[])throws Exception{    
         FileReader fr=new FileReader("C:\\Users\\MRUDULA N NAIK\\Desktop\\Dxc");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    
   }    

}
