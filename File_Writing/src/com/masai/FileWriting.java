package com.masai;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		File file = new File("info.txt");
		
		if(!file.exists()) {
			System.out.println("No file Found with this name. Please create file........ ");
			return;
		}
		
/*		WITHOUT APPEND OR APPENDING IS FALSE SO THE OLD CONTENT GET DELETED FROM THE FILE
		FileWriter fw = new FileWriter(file,false);
		DEFAULT IS FALSE
		FileWriter fw = new FileWriter(file); */
		
		
		
		FileWriter fw = new FileWriter("info.txt",true);
		
		fw.write("\nJAVA IS EASY TO LEARN");
		
		fw.close();
		

		
		
		System.out.println("\nPLEASE WAIT YOUR DATA IS WRITING......");
		Thread.sleep(3000);
		
		
		System.out.println("\n\nYour data successfully wrote");
		
	}

}
