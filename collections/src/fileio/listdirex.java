package fileio;

import java.io.File;

public class listdirex {
	public static void main(String[] args) {
		File file = null;
		file = new File("C:\\Users\\MRUDULA N NAIK\\Desktop");
		String[] directories;
		
		directories = file.list();
		for(String path: directories) {
			System.out.println(path);
		}
	}

}
