package com.Arrays;

public class Reverseanarray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,-50,-120,80,90};
		int temp=0;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
