package com.Arrays;

public class Reverseeverynum {

	public static void main(String[] args) {
		int a[] = {12,13,120,157};
		for(int i=0;i<a.length;i++) {
			String s="";
			while(a[i]!=0) {
				int r=a[i]%10;
				a[i]/=10;
				s+=r;
			}
			System.out.print(s+" ");
		}
		
	}

}
