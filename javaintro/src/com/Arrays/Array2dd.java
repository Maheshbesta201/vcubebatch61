package com.Arrays;

//Write a Java Program to Make Normal Matrix into Its Transpose Matrix Using 2D Array 
//Input 1   2   output 1  3
//      3   4          2  4

public class Array2dd {

	public static void main(String[] args) {
		int[][] arr= new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
