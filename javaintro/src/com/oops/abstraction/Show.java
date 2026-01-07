package com.oops.abstraction;

public class Show {

	public static void main(String[] args) {
		System.out.println("vivo mobile !!");
		Vivo v=new Vivo();
		v.battery();
		v.camera();
		v.price();
		v.processor();
		v.kit();
		System.out.println("********************************************");
		System.out.println("Iqoo mobile !!");
		Iqoo i=new Iqoo();
		i.battery();
		i.price();
		i.camera();
		i.processor();
		i.newproccessor();
		
	}

}
