package com.Arrays;

public class MinandMax {

	public static void main(String[] args) {
		int[] arr= {10,20,30,-50,-120,80,90};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];	
			}else if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Min value : "+min);
		System.out.println("Max value : "+max);
	}

}
