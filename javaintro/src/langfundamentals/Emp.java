package langfundamentals;

public class Emp {
	int empid;
	int procom;
	int overtime;
	double basicsal;

	public static void main(String[] args) {
		Emp e=new Emp();
		e.emp1();
		e.emp2();
		e.emp3();
	}
	void emp1() {
		empid=101;
		procom=3;
		overtime=15;
		basicsal=10000;
		double sal=(basicsal*10)/100;
		double sal1=(basicsal*5)/100;
		boolean bonous=(procom>=3)&&(overtime>=10);
		boolean bonous1=(procom>=3)||(overtime>=10);
		double b=(bonous&&bonous1)?(basicsal+sal):(bonous||bonous1)?(basicsal+sal1):(basicsal+0);
		int d=(basicsal!=b)?(procom+1):(procom+0);
		System.out.println("employee id : "+empid);
		System.out.println("projects completed : "+procom);
		System.out.println("overtime in hours"+overtime);
		System.out.println("basic salary : "+basicsal);
		System.out.println("Basic salary including bonous :"+b);
		System.out.println("projects incresed after calculate bonous : "+d);
		
	}
	void emp2() {
		empid=102;
		procom=2;
		overtime=12;
		basicsal=10000;
		double sal=(basicsal*10)/100;
		double sal1=(basicsal*5)/100;
		boolean bonous=(procom>=3)&&(overtime>=10);
		boolean bonous1=(procom>=3)||(overtime>=10);
		double b=(bonous&&bonous1)?(basicsal+sal):(bonous||bonous1)?(basicsal+sal1):(basicsal+0);
		int d=(basicsal!=b)?(procom+1):(procom+0);
		System.out.println("employee id : "+empid);
		System.out.println("projects completed : "+procom);
		System.out.println("overtime in hours"+overtime);
		System.out.println("basic salary : "+basicsal);
		System.out.println("Basic salary including bonous :"+b);
		System.out.println("projects incresed after calculate bonous : "+d);

		
	}void emp3() {
		empid=103;
		procom=1;
		overtime=9;
		basicsal=10000;
		double sal=(basicsal*10)/100;
		double sal1=(basicsal*5)/100;
		boolean bonous=(procom>=3)&&(overtime>=10);
		boolean bonous1=(procom>=3)||(overtime>=10);
		double b=(bonous&&bonous1)?(basicsal+sal):(bonous||bonous1)?(basicsal+sal1):(basicsal+0);
		int d=(basicsal!=b)?(procom+1):(procom+0);
		System.out.println("employee id : "+empid);
		System.out.println("projects completed : "+procom);
		System.out.println("overtime in hours"+overtime);
		System.out.println("basic salary : "+basicsal);
		System.out.println("Basic salary including bonous :"+b);
		System.out.println("projects incresed after calculate bonous : "+d);

		
	}

}
