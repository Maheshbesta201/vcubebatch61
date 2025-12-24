package com.Patterns;

public class Testdemo4 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				if(i%2==0) {
					System.out.print("*"+" ");
				}else {
					if(j<2){
						System.out.print(" "+"*");
					}
				}
			}
			System.out.println();
		}
	}

}
