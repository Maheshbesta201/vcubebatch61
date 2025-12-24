package com.Arrays;

//Write a Java program to find all duplicate elements in an array and display them only once

public class Repeating {

	public static void main(String[] args) {
		int[] a = { 4, 2, 7, 2, 9, 4, 7, 3,7,3};
		for (int i = 0; i <a.length; i++) {
			int count=0;
			for (int j = i; j < a.length-1 ; j++) {
				if (a[i] == a[j+1]) {
					count++;
				}
			}
			if(count==1)
				System.out.print(a[i]+" ");
		}
	}
}
