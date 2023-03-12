package com.masai;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) throws IOException {
	
	File info = new File("Info.txt");
	
	if(!info.exists()) {
		
		System.out.println("File is not exists please first create file.......");
		return;
		
	}
	
	System.out.println("Yor file is found in  ->  "+info.getAbsolutePath());
	System.out.println("File Size(Character Present)  ->   "+info.length());
	
	
	System.out.println("\nHERE IS THE CONTENT OF THE FILE\n\n");
	
    FileReader fr = new FileReader(info);
    
//    OR
    FileReader fr2 = new FileReader("info.txt");
    
    int i;
    
    while((i=fr2.read()) != -1)
    	System.out.print((char)i);
    
	
    fr.close();
    fr2.close();
		
		
		
		
	}

}
