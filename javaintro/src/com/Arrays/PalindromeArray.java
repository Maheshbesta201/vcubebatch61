package com.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		int a[] = {121,122,222};
		for(int i=0;i<a.length;i++) {
			int b=a[i];
			int sum=0;
			while(a[i]!=0) {
				int r=a[i]%10;
				sum=sum*10+r;
				a[i]/=10;
			}
			if(sum==b) {
				System.out.print(b+" ");
			}
		}
		
	}

}
