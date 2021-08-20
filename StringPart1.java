package com.syntax.review.calss06;

public class StringPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello!";
		String str2=new String ("Hello");
		
		// To identify the length(amount of symbols) of the string
		
		System.out.println(str.length()); //6
		System.out.println(str2.length()); //5
		
		// To convert the string into uppercase
		
		String name="my name is fufa";
		System.out.println(name.toUpperCase());
		
		// To convert the string into lowercase
		
		String name1="MY NAME IS FUFA";
		System.out.println(name1.toLowerCase());
		
		// Add 2 Strings together
		
		String firstName="Nailya";
		String lastName="Talgat";
		
		System.out.println(firstName.concat(" ").concat(lastName));
		
		// isEmty
		String batch="Batch10";
		boolean result=batch.isEmpty();
		System.out.println(result); // false

	}

}
