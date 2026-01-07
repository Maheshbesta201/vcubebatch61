package com.Arrays;

import java.util.Scanner;

public class Array2d1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array row count ");
		int a1=sc.nextInt();
		System.out.println("enter array column count ");
		int a2=sc.nextInt();
		int[][] a=new int[a1][a2];
		System.out.println("Enter values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
