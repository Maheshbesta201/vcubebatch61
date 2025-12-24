package com.Patterns;

public class Boxes {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		int[][] a1=new int[a][b];
		for(int k=0;k<b;k++) {
			System.out.print(" __");
		}
		System.out.println();
		for(int i=0;i<a1.length;i++) {
			System.out.print("|");
			for(int j=0;j<b;j++) {
				System.out.print("__|");
			}
			System.out.println();
		}
		
	}

}
