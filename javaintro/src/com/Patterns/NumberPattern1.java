package com.Patterns;

public class NumberPattern1 {

	public static void main(String[] args) {
		int k=0;
		int i=5;
		int h=9;
		int n=i*i+1;
		for(i=5;i>0;i--) {
			k++;
			for(int j=k;j<=k;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(n+"\t");
				n++;
			}
			n=n-h;
			h=h-2;
			System.out.println();		}
	}

}