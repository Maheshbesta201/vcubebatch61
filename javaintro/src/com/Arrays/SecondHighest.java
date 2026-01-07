package com.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int[] arr= {5,7,2,10,14,12};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[] a=new int[arr.length];
		for(int j=0;j<a.length;j++) {
			if(arr[j]!=max) {
				a[j]=arr[j];
			}
		}
		int max1=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max1=a[i];
			}
		}
		System.out.println(max1);
	}

}
