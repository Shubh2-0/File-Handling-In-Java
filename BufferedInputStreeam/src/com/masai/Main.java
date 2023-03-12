package com.masai;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));	
		
	BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream("Student.txt"));
	
	br.write();
    
	
	
	
		
	}

}
