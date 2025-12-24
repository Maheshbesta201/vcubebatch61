package langfundamentals;

public class Employee2 {

	public static void main(String[] args) {
		Double Salary=27000d;
		Double Pf = (Salary*5)/100;
		Double CGST=(Salary*7)/100;
		Double DA=(Salary*3)/100;
		Double DedSalary=(Salary-(Pf+CGST));
		Double NetSalary=DedSalary+DA;
		
		System.out.println("PF Deduction per Month :"+Pf);
		System.out.println("CGST Deduction per Month :"+CGST);
		System.out.println("DA Credit per Month :"+DA);
		System.out.println("The Net Salary After Deductions per month :"+NetSalary);
		System.out.println("The Net Salary After Deductions Anual :"+NetSalary*12);

	}

}
