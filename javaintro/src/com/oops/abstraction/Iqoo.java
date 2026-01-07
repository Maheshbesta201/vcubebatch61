package com.oops.abstraction;

public class Iqoo implements Mobile {

	@Override
	public void camera() {
		System.out.println("100 Mega Pixel");
	}

	@Override
	public void processor() {
		System.out.println("8 Gen 2");
	}

	@Override
	public void battery() {
		System.out.println("7000 Mah");
	}

	@Override
	public void price() {
		System.out.println("25,000/-");
	}
	
	public void newproccessor() {
		System.out.println("dual chip");
	}

}
