//package com.manipal.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("data.txt"); // create file object which represents a file called data.txt
		boolean result;
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		
		try {
			result = file.createNewFile();
			if(result)      // ===>>>> if(result == true)
				System.out.println("File created");
			else
				System.out.println("File not created");
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}


	
}
