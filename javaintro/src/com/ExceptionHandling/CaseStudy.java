package com.ExceptionHandling;

public class CaseStudy {

	public static void main(String[] args) {
		String[] s= new String[3];
		s[0]="mahesh";
		s[1]="Anand";
		s[2]="Hari";
		try {
			System.out.println(s[3]);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Student not found-Invalid index");
		}finally {
			System.out.println("The operation completed ");
		}
	}

}
