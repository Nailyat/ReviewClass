package com.syntax.review.calss06;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	char gender;
	double height;
	int weight;
	
	void bark() {
		System.out.println(name+" can bark");
	}
	
	void sleep() {
		System.out.println(name+" can sleep");
	}

	public static void main(String[] args) {
		
		System.out.println("-------------TEST------------");
		
		Dog dog1=new Dog();
		dog1.name="Jack";
		dog1.breed="Husky";
		dog1.color="White";
		dog1.age=2;
		dog1.gender='M';
		dog1.height=30.5;
		dog1.weight=20;
		
		dog1.bark();
		dog1.sleep();
		
		Dog dog2=new Dog();
		dog2.name="Bingo";
		dog2.breed="Husky";
		dog2.color="Ginger";
		dog2.age=3;
		dog2.gender='M';
		dog2.height=35.5;
		dog2.weight=22;
		
		dog2.sleep();
	}
}
