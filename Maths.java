package com.syntax.review.calss06;

public class Maths {
	
	void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	void substraction(int num1, int num2) {
		System.out.println(num1-num2);
	}
	
	void multiplication(int num1, int num2) {
		int result=num1*num2;
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------TEST---------");
		
		Maths test=new Maths();
		
		test.addition(12, 28);
		test.substraction(23, 9);
		test.multiplication(26, 3);

	}

}
