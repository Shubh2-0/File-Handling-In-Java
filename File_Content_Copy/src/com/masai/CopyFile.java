package com.masai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
	FileInputStream fis = new FileInputStream(new File("A.txt"));
	FileOutputStream fos = new FileOutputStream("B.txt");
	
	
	int i;
	
	while( (i=fis.read()) != -1 )
		fos.write( (char)i);
		
		
		
		
		
		
		
		
		
		
	
	System.out.println("\nPlease wait your data is Coping from A to B");
	
	Thread.sleep(2000);
	
	fis.close();
	fos.close();
	
	System.out.println("\n\nCopied Successefully");
	
	
		
	}
	

}
