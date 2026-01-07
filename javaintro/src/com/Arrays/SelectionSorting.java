package com.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		int arr[]= {10,50,30,6,8,1,22};
		int min=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
