package langfundamentals;

public class Restaurent {
	int starter() {
		int starter=300;
		return starter;
	}
	int MainCourse() {
		int Main=500;
		return Main;
		
	}
	int Desert() {
		int desert=200;
		return desert;
		
	}

	public static void main(String[] args) {
		Restaurent r=new Restaurent();
		int starter=r.starter();
		int main=r.MainCourse();
		int desert=r.Desert();
		int total=starter+main+desert;
		int tax=(5*total)/100;
		int ServiceCharge=(10*total)/100;
		int finala=total+tax+ServiceCharge;
		System.out.println("total amount without taxes:"+total);
		System.out.println("tax :"+tax);
		System.out.println("service charge :"+ServiceCharge);
		System.out.println("Final Bill Amount :"+finala);

	}

}
