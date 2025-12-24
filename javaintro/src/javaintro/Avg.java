package javaintro;

public class Avg {

	public static void main(String[] args) {
		int Stu_id=201;
		String Stu_name="mahesh";
		int Stu_age=24;
		int physics=40;
		int maths=30;
		int chemistry=35;
		int total=physics+maths+chemistry;
		int avg=total/3;
		System.out.println("Student Name :"+Stu_name);
		System.out.println("Student id :"+Stu_id);
		System.out.println("Student age :"+Stu_age);
		System.out.println("avarage marks greater than or equal to 35 it shows true otherwise false");
		System.out.println(avg>=35);
	}

}
