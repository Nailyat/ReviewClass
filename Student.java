package com.syntax.review.class06;

public class Student {
	
	String firstName;
	String lastName;
	String school;
	String course;
	int ID;
	
	void study() {
		System.out.println(firstName+" "+lastName+" studies on course "+course+" in "+school+".");
	}
	void getScholarship() {
		System.out.println("Student "+firstName+" "+lastName+" ID number "+ID+" gets a scholarship.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------TEST-------");
		
		Student test=new Student();
		
		test.firstName="Nailya";
		test.lastName="Talgat";
		test.school="Harvard";
		test.course="SDET";
		test.ID=1206;
		
		test.study();
		test.getScholarship();
		System.out.println();
		
		
           Student test1=new Student();
		
		test1.firstName="Daulet";
		test1.lastName="Talgat";
		test1.school="MIT";
		test1.course="SDET";
		test1.ID=2806;
		
		test1.study();
		test1.getScholarship();
		System.out.println();
		
            Student test2=new Student();
		
		test2.firstName="Ilyas";
		test2.lastName="Talgat";
		test2.school="Yale";
		test2.course="SDET";
		test2.ID= 909;
		
		test2.study();
		test2.getScholarship();
		System.out.println();
		
		
                Student test3=new Student();
		
		test3.firstName="Selina";
		test3.lastName="Talgat";
		test3.school="Columbia";
		test3.course="SDET";
		test3.ID= 2307;
		
		test3.study();
		test3.getScholarship();
		System.out.println();

	}

}
