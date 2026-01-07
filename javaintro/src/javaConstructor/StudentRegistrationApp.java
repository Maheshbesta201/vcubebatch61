package javaConstructor;

class Registration {
	private int age;
	private String gender;
	private String name;
	
	public Registration(int age,String name,String gender) {
		this.gender=gender;
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Registration details ");
		System.out.println("----------------------- ");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Gender : "+gender);

	}
}
class Student {
	private int rollno;
	private String grade;
	private String name;
	
	
	public Student(int rollno,String name,String grade) {
		this.grade=grade;
		this.name=name;
		this.rollno=rollno;
	}
	public void disp() {
		System.out.printf("%-10d %-15s %-3s\n",rollno,name,grade);
	}
	public static void m1() {
		System.out.printf("%-10s %-15s %-10s\n","rollno","name","grade");
		System.out.println("----------------------------------");
	}

}
public class StudentRegistrationApp {

	public static void main(String[] args) {
		Student s1=new Student(01,"Harikanth","A+");
		Student s2=new Student(02,"Chethan","B+");
		Student s3=new Student(03,"Vasanth","B+");
	 	
		Registration st=new Registration(23,"Mahesh","Male");
		System.out.println("Student Details");
		Student.m1();
		s1.disp();  
		s2.disp();
		s3.disp();
		
		System.out.println();
		st.display();
	}
	

}
