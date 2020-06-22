package com.manipal.file;


	
	
	
	
	import java.io.File;
	import java.io.IOException;
	public class Directory {
		
	
		public static void main(String[] args) {
			File myDir  = new File("programs"); // create file object which represents a file called data.txt
			boolean result = myDir.mkdir();
			System.out.println(result);
			System.out.println(myDir.getAbsolutePath());
			
			
			File file = new File(myDir,"music.txt");
			try {
				file.createNewFile();
				System.out.println(file.exists());
				System.out.println(file.getAbsolutePath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
	}


