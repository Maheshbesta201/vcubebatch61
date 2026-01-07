package com.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {40,80,20,30,9,2};
		int temp=0;
		for(int i=0;i<a.length  ;i++){
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];  //80
					a[j]=a[j+1]; //20
					a[j+1]=temp;
				}
			}
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

}
