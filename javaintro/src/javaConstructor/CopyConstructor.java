package javaConstructor;

public class CopyConstructor {
	int id;
	String name;

	public CopyConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CopyConstructor(CopyConstructor c) {
		this.id=c.id;
		this.name=c.name;
		
	}

	public static void main(String[] args) {
		
		CopyConstructor c=new CopyConstructor(1, "Mahesh");
		
		CopyConstructor c2=new CopyConstructor(2,"Guna");
		
		CopyConstructor c1=new CopyConstructor(c2);
		
		System.out.println(c1.id+" "+c1.name);
		
		
		
	}

}
