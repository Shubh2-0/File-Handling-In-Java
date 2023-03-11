package com.masai;

import java.io.File;

public class DirectoryCreate {
	
	
	public static void main(String[] args) {
		
	
	File dir = new File("Dummy");
	
	dir.mkdir();
	
	System.out.println("\nis Dummy is exists -> "+dir.exists());
	System.out.println("\nDummy is Folder(Directory) -> "+dir.isDirectory());
	System.out.println("\nDummy is File -> "+dir.isFile());
	System.out.println("\nLocation of Dummy -> "+dir.getPath());
    System.out.println("\nHow many file and folder Dummy contain -> "+dir.list().length);	
		
		
	}
	

}
