package com.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 1 };
		int a = 7;
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (s.contains(arr[i] + "") && s.contains(arr[j] + "")) {
					continue;
				}
				if (arr[i] + arr[j] == a) {
					s = s + arr[i] + "" + arr[j] + "";
					System.out.print(arr[i] + "" + arr[j]+" ");
				}
			}
		}
//		System.out.println(s);
	}

}
