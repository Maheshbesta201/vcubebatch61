package com.Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int b:arr) {
			System.out.print(b+" ");
		}
		sc.close();
	}

}
