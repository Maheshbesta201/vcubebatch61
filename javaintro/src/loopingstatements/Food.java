package loopingstatements;

import java.util.Scanner;

public class Food {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please select any one in this list");
		System.out.println("1.SouthIndian");
		System.out.println("2.NorthIndian");
		System.out.println("3.Chinese");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			southindian();
			break;
		case 2:
			northindian();
			break;
		case 3:
			chinese();
			break;
		default :
			System.out.println("Enter valid input :");
		}

	}

	static void southindian() {
		System.out.println("Which item you want !!!");
		System.out.println("1.Dosa : 60rs");
		System.out.println("2.Idly : 50rs");
		System.out.println("3.vada : 40rs");
		int i=sc.nextInt();
		if(i==1) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*60)-20;
				System.out.println("The selected item is Dosa !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*60)-10;
				System.out.println("The selected item is Dosa !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*60);
				System.out.println("The selected item is Dosa !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
		}
		else if(i==2) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*50)-20;
				System.out.println("The selected item is Idly !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*50)-10;
				System.out.println("The selected item is Idly !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*50);
				System.out.println("The selected item is Idly !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else if(i==3) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*40)-20;
				System.out.println("The selected item is Vada !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*40)-10;
				System.out.println("The selected item is Vada !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*40);
				System.out.println("The selected item is Vada !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else {
			System.out.println("Enter Valid input ");
		}
	}

	static void northindian() {
		System.out.println("Which item you want !!!");
		System.out.println("1.Butter Chicken : 200rs");
		System.out.println("2.biryani : 250rs");
		System.out.println("3.Tandoori Chicken :300rs");
		int i=sc.nextInt();
		if(i==1) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*200)-20;
				System.out.println("The selected item is Butter Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*200)-10;
				System.out.println("The selected item is Butter Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*200);
				System.out.println("The selected item is Butter Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else if(i==2) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*250)-20;
				System.out.println("The selected item is Biryani !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*250)-10;
				System.out.println("The selected item is Biryani !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*250);
				System.out.println("The selected item is Biryani !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else if(i==3) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*300)-20;
				System.out.println("The selected item is Tandori Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*300)-10;
				System.out.println("The selected item is Tandori Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*300);
				System.out.println("The selected item is Tandori Chicken !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else {
			System.out.println("Enter Valid input ");
		}

	}

	static void chinese() {
		System.out.println("Which item you want !!!");
		System.out.println("1.Gobi : 100rs");
		System.out.println("2.Noodeles : 120rs");
		System.out.println("3.Egg Rice : 110rs");
		int i=sc.nextInt();
		if(i==1) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*100)-20;
				System.out.println("The selected item is Gobi !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*100)-10;
				System.out.println("The selected item is Gobi !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*100);
				System.out.println("The selected item is Gobi !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else if(i==2) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*120)-20;
				System.out.println("The selected item is Noodeles !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*120)-10;
				System.out.println("The selected item is Noodeles !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*120);
				System.out.println("The selected item is Noodeles !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else if(i==3) {
			System.out.println("How much quantity do you want sir !!");
			int Quantity=sc.nextInt();
			if(Quantity>3) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 20rs");
				int a=(Quantity*110)-20;
				System.out.println("The selected item is Egg Rice !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity ==2) {
				System.out.println("Thank you purchasing this no of items i will give you a discount of 10rs");
				int a=(Quantity*110)-10;
				System.out.println("The selected item is Egg Rice !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else if(Quantity==1) {
				int a=(Quantity*110);
				System.out.println("The selected item is Egg Rice !!");
				System.out.println("The quantity of an item is : "+Quantity);
				System.out.println("Your total bill amount is : "+a);
			}
			else {
				System.out.println("Please select correct input");
			}
			
		}
		else {
			System.out.println("Enter Valid input ");
		}

	}
}
