package com.oops.abstraction;

public class Vivo implements Mobile{

	@Override
	public void camera() {
		System.out.println("64 Mega Pixel");
	}

	@Override
	public void processor() {
		System.out.println("8300 Domensity");
	}

	@Override
	public void battery() {
		System.out.println("5000Mah");
	}

	@Override
	public void price() {
		System.out.println("26,999/-");
	}
	
	public void kit() {
		System.out.println("camera protection");
	}

}
