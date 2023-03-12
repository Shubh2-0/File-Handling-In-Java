package com.masai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRename {

	
	public static void main(String[] args) throws IOException {
	
	File file = new File("A.txt");
	
	if(!file.exists()) {
	
		System.out.println("File is not found.....let me create this file");
		try {
			System.out.println("Please wait program is creating file");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	  file.createNewFile();
	  System.out.println("\nFile created successfully.......\n\n");
	  
	  System.out.print("Please enter new name here : ");
	  Scanner sc = new Scanner(System.in);
	  String name = sc.next();
	  
	  name+=".txt";
	  
	  System.out.println("\n\nRenaming the file please wait.....");
	  
	  File file2 = new File(name);
	  
	  file.renameTo(file2);
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  System.out.println("Name update successfully");
	  
	  System.out.println("\n\n New name is : "+file2.getName());
	  
	  
	  
	  
	  
		
	}
	
	
		
		
		
	}
	
}
