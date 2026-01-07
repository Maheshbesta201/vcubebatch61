package javaConstructor;

public class Vehicle2 {

	String vehicletype;

	Vehicle2(String vehicletype) {
		System.out.println("vehicle Constructor called  "+vehicletype);
		this.vehicletype = vehicletype;
		

	}
	public static void main(String[] args) {
		car2 c2=new car2("Tata");
	}
	
}
class car2 extends Vehicle2{
	car2(String cartype) {
		super("car");
		System.out.println(cartype);
		
	}
	
}

