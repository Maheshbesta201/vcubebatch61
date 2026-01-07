package com.Arrays;

public class Digitcount2 {

	public static void main(String[] args) {
		int arr[] = {122,123,256,342};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			while(arr[i]!=0) {
				int r=arr[i]%10;
				if(r==2) {
					c+=1;
				}
				arr[i]/=10;
			}
		}
		System.out.print("The count 2 digit in an array : "+c);
	}

}
