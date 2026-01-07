package com.Arrays;

public class EvenoddIndex {

	public static void main(String[] args) {
		int a[] = {12,13,25,6};
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i]=a[i]*2;
			}
			else {
				a[i]=a[i]*3;
			}
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}

}
