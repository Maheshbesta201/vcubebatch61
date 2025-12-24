package com.StudentRegistration;

public class Student {
	private int rollno;
	private String grade;
	private String name;
	
	
	public Student(int rollno,String name,String grade) {
		this.grade=grade;
		this.name=name;
		this.rollno=rollno;
	}
	public void disp() {
		System.out.printf("%-10d %-15s %-3s\n",rollno,name,grade);
	}
	public static void m1() {
		System.out.printf("%-10s %-15s %-10s\n","rollno","name","grade");
		System.out.println("----------------------------------");
	}

}
