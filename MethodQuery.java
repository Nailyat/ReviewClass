package com.syntax.review.calss06;

public class MethodQuery {
	
	double getMax(double n1, double n2) {
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}}
		
		void getMaxWithoutReturn(double n1, double n2) {
			if(n1>n2) {
				System.out.println(n1);
			}else {
				System.out.println(n2);
			}
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------TEST-----");
		
		MethodQuery test=new MethodQuery();
		
		double result=test.getMax(23, 28);
		System.out.println(result);
		
		test.getMaxWithoutReturn(26, 12);

	}

}
