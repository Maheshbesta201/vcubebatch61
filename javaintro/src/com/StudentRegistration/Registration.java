package com.StudentRegistration;

public class Registration {
	private int age;
	private String gender;
	private String name;
	
	public Registration(int age,String name,String gender) {
		this.gender=gender;
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Registration details ");
		System.out.println("----------------------- ");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Gender : "+gender);

	}
}
