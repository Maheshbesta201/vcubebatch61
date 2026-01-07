package javaConstructor;

public class vehicle {
	String type;
	String brand;
	int battcap;
	
	vehicle(String type){
		System.out.println("Vehicle Type : "+type);
	}
	
}
class car extends vehicle{	
	car(String type,String brand){	
		super("car");
		System.out.println("Vehicle Brand : "+brand);
	}
	
}

class electriccar extends car {
	electriccar (String type,String brand,int battcap){
		super("Car","Tata");
		System.out.println("Vehicle Battery Capacity : "+battcap);
	}
		public static void main(String[] args) {
			electriccar v=new electriccar("Car","Tata",5000);
		}
}
	

