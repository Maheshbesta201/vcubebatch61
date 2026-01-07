package com.Patterns;

public class ABCD {

	public static void main(String[] args) {
		int[][] a=new int[6][5];
		int b=65;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<1;j++) {
				System.out.print((char)b+" "+(char)(b+1)+" "+(char)(b+2)+" "+(char)(b+3)+" "+(char)(b+4)+" ");	
			}
			System.out.println();
			b=b+5;
		}
		
	}

}
