package com.masai;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	ArrayList<Student> list = new ArrayList<>();
	
	list.add(new Student("Shivansh", 21, "Banglore", 540.10));
	list.add(new Student("Pankaj", 24, "Mumbai", 281.92));
	list.add(new Student("Ram", 23, "Indore", 310.41));
	list.add(new Student("Lakshman", 26, "Jaipur", 290.3));
	list.add(new Student("Karn", 19, "Mizapur", 90.84));
	list.add(new Student("Deva", 31, "Kanpur", 121.12));
	list.add(new Student("Ipra", 29, "Kolkata", 292.20));
	
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
	
	list.forEach( e -> {
	
	try {
		bw.write(e.toString());
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
		
		
	});
	
	bw.close();
	
	System.out.println("\nPlease wait data adding to the file.............");
	Thread.sleep(2000);
	
	System.out.println("\nadding successfully.....");
	
		
	
		
		
		
	}
	
}
