package pkg23exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JP02ExceptionsThrowsDemo {
	
	static void findFile() throws FileNotFoundException {
		
		File fh = new File("file.txt");
		FileInputStream fisText = new FileInputStream(fh);
	}

	public static void main(String[] args) {
		
		try {
			
			findFile();
		
		} catch(Exception e) {
			
			System.out.println("File is not found.");
		}
	}
}
