package javaConstructor;

public class Tableorder {
	int TableNumber;
	static int TotalItemsOrdered;
	static float TotalBillAmount;
	
	Tableorder(int number){
		this.TableNumber=number;
		
	}
	
	static void addonorder(int i,float b,float c) {
		TotalItemsOrdered=i;
		TotalBillAmount=b+c;
		
	}
	static void servicecharge(float percentage) {
		float per=percentage;
		TotalBillAmount +=(TotalBillAmount*per)/100;
	}
	void printthebill() {
		System.out.println("table number :"+TableNumber);
		System.out.println("total items ordered :"+TotalItemsOrdered);
		System.out.println("total bill amount :"+TotalBillAmount);
	}

	public static void main(String[] args) {
		Tableorder t =new Tableorder(201);
		t.addonorder(5, 200,150);
		t.servicecharge(5);
		t.printthebill();
		
	}

}
