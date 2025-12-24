package com.Patterns;

public class NumbersPattern {

	public static void main(String[] args) {
		int k=0;
		int l=0;
		int n=1;
		int i=5;
		int h=9;
		int p=i*i+1;
		for(i=5;i>0;i--) {
			k++;
			for(int j=2;j<=k;j++) {
				l=j;
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(n+"\t");
				n++;
			}
//			System.out.print(" ");
			k++;
			for(int j=k;j<=k;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(p+"\t");
				p++;
			}
			System.out.println();
			p=p-h;
			p=h-2;
			}
	}

}
