//Digit Sum Filter
//
//Print all numbers from 1 to 200 whose sum of digits is divisible by 7.
//Example output snippet:
//
//7 16 25 34 43 52 61 70 79

package javalooping;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		for(int i=1;i<200;i++) {
			int a=i;
			if(a==7) {
				System.out.print(a+" ");
			}
			while(a>9) {
				int sum=0;
				while(a!=0) {
					int r=a%10;  //16%10--> 6,79%10-->9
					sum=sum+r;   //0=0+6-->6  6=6+1-->7,0=0+9-->9 9=9+7-->16
					a=a/10;      //16/10 --> 1,0   ,79/10-->7 7/10-->0
				}
				a=sum;  
				if(sum==7) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
