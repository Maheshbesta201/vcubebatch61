package Collections;

public class CustomException {
	static void checkage(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}else {
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args){
		
		try {
			checkage(16);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("main mathod ended");
	}
	
}
class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String msg) {
		super(msg);
	}
}