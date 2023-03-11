package com.masai;

import java.io.File;
import java.util.Scanner;

public class CreatingFile {

	
	public static void createFile() {
		
	
	System.out.println("\n\nPlease enter file\n\n");
	
	Scanner sc = new Scanner(System.in);
	
	String name = sc.next();
	
	name+=".txt";
	
	File file = new File(name);
	
	try {
		file.createNewFile();
		
		System.out.println("\nCreating please wait......\n");
		
		Thread.sleep(2000);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	System.out.println("File Create Successfully.......");
	
	
	
	
		
		
	}
	
	
	
}
