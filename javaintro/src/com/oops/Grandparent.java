package com.oops;

public class Grandparent {
	
	void display() {
		System.out.println("iam Grandparent");
	}
	

}
class parent extends Grandparent{
	
	void display() {
		System.out.println("iam parent");
		Grandparent gp=new Grandparent();
		gp.display();
	}
	
}

class child extends parent{
	public static void main(String[] args) {
		child c=new child();
		c.display();
	}
	void display() {
		System.out.println("iam child");
		super.display();
	}
	
}
