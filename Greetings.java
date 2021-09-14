package com.syntax.review.class06;

public class Greetings {
	
	void sayHelloBatch10() {
		System.out.println("Hello Geniuses!");
		System.out.println("Hello Geniuses!");
		System.out.println("Hello Geniuses!");
	}

	void printAge(int age) {
		System.out.println("The student's age is "+age);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------TEST------");

		Greetings test= new Greetings();
		test.sayHelloBatch10();
		
		Greetings studentAge=new Greetings();
		studentAge.printAge(20);
		studentAge.printAge(21);
		studentAge.printAge(18);
	}

}
