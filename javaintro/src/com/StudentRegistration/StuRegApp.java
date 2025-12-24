package com.StudentRegistration;

public class StuRegApp {

	public static void main(String[] args) {
		Student s1=new Student(01,"Harikanth","A+");
		Student s2=new Student(02,"Chethan","B+");
		Student s3=new Student(03,"Vasanth","B+");
	 	
		Registration st=new Registration(23,"Mahesh","Male");
		System.out.println("Student Details");
		Student.m1();
		s1.disp();  
		s2.disp();
		s3.disp();
		
		System.out.println();
		st.display();
	}
	

}
