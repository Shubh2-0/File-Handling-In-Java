package com.masai;

public class Student {
	
	String name;
	int age;
	String city;
	double marks;
	
	public Student(String name, int age, String city, double marks) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name : " + name + "    Age : " + age + "    City : " + city + "    Marks : " + marks+"\n";
	}
	
	
	

}
