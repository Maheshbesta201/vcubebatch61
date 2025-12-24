package langfundamentals;

public class Employee {
	{
		Integer EmployeeNo=201;
		String EmployeeName="Mahesh";
		Double Salary=5000d;	
		String Hiredate="30 june 2025";
		Integer Experience=3;
		Integer AnualBonou=10;
		Double Anualsalary=12*Salary;
		Double Anualbonous=Anualsalary/AnualBonou;
		Double totalanualearning =Anualsalary+Anualbonous;
		System.out.println("Employee Name :"+EmployeeName);
		System.out.println("Employee Id :"+EmployeeNo);
		System.out.println("Employee Salary per month :"+Salary);
		System.out.println("Employee Hiring date :"+Hiredate);
		System.out.println("Employee Experience :"+Experience);
		System.out.println("Employee Anualbonous percentage :"+AnualBonou);
		System.out.println("Employee AnualBonous Salary :"+Anualsalary);
		System.out.println("Employee bonous in rupees :"+Anualbonous);
		System.out.println("Employee TotalEarnings in one year :"+totalanualearning);


	}

	public static void main(String[] args) {
		Employee e=new Employee();
		}

}
