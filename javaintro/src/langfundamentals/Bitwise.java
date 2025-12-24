package langfundamentals;

public class Bitwise {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a^b; //30
		b=a^b; //10
		a=a^b; //20
		
		System.out.println("updated a value : "+a);
		System.out.println("updated b value : "+b);

	}

}


//16 8 4 2 1
//0  1 0 1 0-->a
//1  0 1 0 0-->b
//------------
//1  1 1 1 0 -->a
//1  0 1 0 0 -->b 
//-----------
//0  1 0 1 0 -->b
//1  1 1 1 0 -->a
//-----------
//1  0 1 0 0-->20