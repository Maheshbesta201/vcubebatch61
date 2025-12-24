package com.Arrays;

public class BiggestString {

	public static void main(String[] args) {
		String s[]= { "hello", "super_saiyajin", 
				"skyfallgood","autonomusultrainstinct", 
				"goodafternoonghhhh"};
		int max=0;
		int k=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>max) {
				max=s[i].length();
				k=i;
			}
		}
		System.out.println(s[k]);
		
	}

}
