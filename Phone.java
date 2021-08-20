package com.syntax.review.calss06;

public class Phone {
	
	String make;
	String model;
	int RAM;
	int ROM;
	int camera;
	boolean is5G;
	double screenSize;
	
	void calls() {
		System.out.println(make+" "+model+" can calls.");
	}
	void takePicture() {
		System.out.println(make+" "+model+" can take a good pictures with the camera "+camera+" and the screen size "+screenSize+".");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" ------------TEST---------");
		
		Phone IPhone=new Phone();

		IPhone.make="Apple";
		IPhone.model="IPhone XIII";
		int RAM;
		int ROM;
		IPhone.camera=12;
		IPhone.is5G=true;
		IPhone.screenSize=5.5;
		IPhone.calls();
		IPhone.takePicture();
	}

}
