package StringHandling;

public class InsufficientBalance {
	static double balance;

	public static void main(String[] args) {
		balance =2000.00;
		
		try {
			if(balance > 1000.00) {
				throw new InsufficientBalanceException("your balance is less than your entered balance");
			}else {
				System.out.println("withdraw Successfull");
			}
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}finally {
			System.out.println("hello guys");
		}

	}

}
class InsufficientBalanceException extends Exception{
	
	private static final long serialVersionUID = 1L;

	InsufficientBalanceException(String s){
		super(s);
	}
}