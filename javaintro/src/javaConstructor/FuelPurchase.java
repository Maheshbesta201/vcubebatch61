package javaConstructor;

public class FuelPurchase {
	
	FuelPurchase(){
		this(300); 
		System.out.println("no arg constructor");
	}
	
	FuelPurchase(int a){
		this("mahesh","anand");
		System.out.println("one arg constructor");
		System.out.println("Value of a : "+a);

	}
	FuelPurchase(String s,String b){
		System.out.println("two arg constructor");
		System.out.println(s);
		System.out.println(b);
	}

	public static void main(String[] args) {
		FuelPurchase f=new FuelPurchase();
		
	}

}
