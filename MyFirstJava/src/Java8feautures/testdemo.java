//Write a Java program using a Functional Interface named Calculator with a method add(int a, int b).
//Use a Lambda Expression in the main() method to implement addition and print the result.
package Java8feautures;

interface in1{
	int add(int a,int b);
}

public class testdemo {

	public static void main(String[] args) {
		in1 i1= (a1,b1)-> {
			return a1+b1;
			};
		int aa=i1.add(20,30);
		System.out.println("addition of two numbers :" +aa);
	}

}
