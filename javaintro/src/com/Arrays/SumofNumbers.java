package com.Arrays;

public class SumofNumbers {

	public static void main(String[] args) {
		int[] arr= {1,2,3,7,6,5,2};
		int target=7;
		int sum=0;
		int start=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			while(sum>target && start<=i) {
				sum-=arr[start++];
			}
			if(sum==target) {
				for(int j=start;j<=i;j++) {
					System.out.print(arr[j]);
				}
				System.out.println();
			}
		}
	}
	 static void work(int i, int j, int[] arr) {
		 for(int k=i;k<=j;k++) {
			 System.out.print(arr[k]+" ");
		 }
	}

}
