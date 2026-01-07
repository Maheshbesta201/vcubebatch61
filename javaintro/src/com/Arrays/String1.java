package com.Arrays;

public class String1 {

	public static void main(String[] args) {
		String s="mahesh";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				s1+=s.toUpperCase().charAt(i);
			}else {
				s1+=s.toLowerCase().charAt(i);
			}
		}
		System.out.println(s1);
	}
}
