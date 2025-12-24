package com.Arrays;

import java.util.*;

public class SumandAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		System.out.println("Enter values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("sum of total elements : " + sum);
		System.out.println("Avg of total elements : " + avg);
		sc.close();
	}
}
