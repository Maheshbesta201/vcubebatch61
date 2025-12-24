package com.Arrays;
//16,17,4,3,5,2
//2,5,17

public class Leader {

	public static void main(String[] args) {
		int a[] = {16,17,4,3,5,2};
		int max=a[a.length-1];
		System.out.print(a[a.length-1]+" ");
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>max) {
				System.out.print(a[i]+" ");
				max=a[i];
			}
		}
	}
}
