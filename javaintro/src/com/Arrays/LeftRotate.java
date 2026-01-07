package com.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int[ ] arr = {1, 2, 3, 4, 5, 6, 7 };
		int k=3;
		rotate(arr,k);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}	
	}

	 static void rotate(int[] arr, int k) {
		 int start=0;
		 int end=arr.length-1;
		 
		 rotation(arr,start,end);
		 		 
		 rotation(arr,k,end);
		 
		 rotation(arr,start,k-1);

	}

	  static void rotation(int[] arr, int start, int end) {
		  int temp=0;
		  for(int i=start;i<end;i++) {
			  temp=arr[i];
			  arr[i]=arr[end];
			  arr[end]=temp;
			  end--;
		  }
				  
		  
	 }
	  
}
