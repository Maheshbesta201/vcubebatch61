package javaintro;

public class Cricket {
	int jerseyno;
	String name;
	int age;
	
	static String CountryName;
	static int CountryCode;

	public static void main(String[] args) {
		System.out.println("Players info !");
		Cricket c1=new Cricket();
		c1.jerseyno=07;
		c1.name="MSD";
		c1.age=45;
		
		CountryName="India";
		CountryCode=91;
		
		System.out.println("Cricketer Countrycode : " +CountryCode);
		System.out.println("Cricketer Country name : "+CountryName);
		System.out.println("Cricketer jerseyno : "+ c1.jerseyno);
		System.out.println("cricketer Name : "+c1.name);
		System.out.println("Cricketerage : "+c1.age);
		
		
	}

}
