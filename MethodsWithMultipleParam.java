package com.syntax.review.calss06;

public class MethodsWithMultipleParam {
	
	void repeatWords (int times, String word) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	void isThisBatchSmart(boolean isSmart) {
		if(isSmart) {
			System.out.println("Everyone will get a job ASAP");	
		}else {
			System.out.println("Wait");
		}
	}
		int add(int n1, int n2) {
			return n1+n2;
		}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------TEST-------");

		MethodsWithMultipleParam test = new MethodsWithMultipleParam();
		
		test.repeatWords(5, "Hello Nailya!");
		
		test.isThisBatchSmart(true);
		
		int sum=test.add(12, 6);
		System.out.println(sum);
	}

}
