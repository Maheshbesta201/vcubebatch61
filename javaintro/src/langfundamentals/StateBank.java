package langfundamentals;

public class StateBank {
	static long next=62310100120l;//122
	String AccountHolderName;
	Double BankBalance;
	Long AccountNumber;
	{
		AccountNumber=next;//121
		next++;
	}

	public static void main(String[] args) {
		StateBank s=new StateBank();
		s.AccountHolderName="mahesh";
		s.BankBalance=10000d;
		System.out.println(s.AccountNumber);
		System.out.println(s.AccountHolderName);
		System.out.println(s.BankBalance);
		
		StateBank s1=new StateBank();
		s1.AccountHolderName="rajesh";
		s1.BankBalance=12000d;
		System.out.println(s1.AccountNumber);

		System.out.println(s1.AccountHolderName);
		System.out.println(s1.BankBalance);
		
		StateBank s2=new StateBank();
		s2.AccountHolderName="Hari";
		s2.BankBalance=15000d;
		System.out.println(s2.AccountNumber);

		System.out.println(s2.AccountHolderName);
		System.out.println(s2.BankBalance);
		
		
		
	}

}
