package fileio;

import java.io.File;

public class CreateDir {
	public static void main(String[] args) {
		File file = null;
		String dirPath = "C:\\Users\\MRUDULA N NAIK\\Desktop\\Demo";
		File d = new File(dirPath);
		d.mkdir();
		}

}
