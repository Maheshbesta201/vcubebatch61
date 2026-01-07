package com.oops;

import java.util.Scanner;

class vehicle{
	String Vname;
	int Vno;
	
	void SetVname(String Vname) {
		this.Vname=Vname;
	}
	String GetVname() {
		return Vname;
	}
	void SetVno(int Vno) {
		this.Vno=Vno;
	}
	int GetVno() {
		return Vno;
	}
	void display() {
		System.out.println("Vehicle Name : "+Vname);
		System.out.println("Vehicle Number : "+Vno);
	}
	
}

public class Driving extends vehicle {
	String drivername;
	int rating;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Driving d=new Driving();
		d.SetVname("Royal Enfield");
		d.SetVno(2025);
		d.SetDrivername("Sankhar");
		System.out.println("enter Rating b/w 1 to 5");
		int i=sc.nextInt();
		if(i>0 && i<6) {
			d.SetRating(i);
		}else {
			System.out.println("enter correct rating");
		}
		d.display();
			
	}
	void SetDrivername(String dname) {
		this.drivername=dname;
	}
	String GetDerivername() {
		return drivername;
	}
	void SetRating(int rating) {
		this.rating=rating;
	}
	int GetRating() {
		return rating;
	}
	void display() {
		super.display();
		System.out.println("Driver Name : "+drivername);
		System.out.println("Driver Rating : "+rating);
	}
	
}
