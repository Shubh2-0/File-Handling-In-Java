package com.masai;

import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
  
	public static void main(String[] args) throws IOException {
	
		


	

		
	
		System.out.println("Welcome\n");
		System.out.println("Press 1 for creating file");
		System.out.println("Press 0 for exit the program\n");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		if(choice==0) {
			
			System.out.println("Thank you for using our services Visit Again.....");
			System.exit(choice);
	
		}
		
		while(choice!=1) {
			if(choice==0) {
				
				System.out.println("Thank you for using our services Visit Again.....");
				System.exit(choice);
		
			}
		
			System.out.println("Please enter valid option");

			
			choice = sc.nextInt();
			
		}
		
		CreatingFile.createFile();
		
		
		
		
		
		
		

		
		
		
		
	}
	
	
}
