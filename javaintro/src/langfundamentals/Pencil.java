package langfundamentals;

public class Pencil {

	public static void main(String[] args) {
		int pencil=7;
		int amount =50;
		int count =amount/pencil;
		int remaining =amount-(pencil*count);
		System.out.println("Total no of pencils :"+count);
		System.out.println("remaining change :"+remaining);
	}

}
