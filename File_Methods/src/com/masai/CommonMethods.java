package com.masai;

import java.io.File;
import java.io.IOException;


public class CommonMethods {

	public static void main(String[] args) {
	
	
		File file = new File("A.txt");
		
		boolean existance = file.exists();
		
		System.out.println(file+" exists ->  " + existance);
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			System.out.println("\nCreating....\n\n");
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file+" exists ->  " + file.exists());
		
		System.out.println("\nHow Many Character are present in the file "+file.length());
		System.out.println("\n is file is Directory(Folder) ? ->  "+file.isDirectory());
		System.out.println("\n file location  -> "+file.getPath());
		System.out.println("\nn file full location -> "+file.getAbsolutePath());
		System.out.println("\n can we read the file ->  "+file.canRead());
		System.out.println("\ncan we write the file -> "+file.canWrite());
		System.out.println("\nfile name is -> "+file.getName());
		System.out.println("\nfile is hidden -> "+file.isHidden());
		
	
		
		
		
		
		
		
		
		
	}
	

}
