package com.oops;

class manager extends Employee {

	private String department;
	
	public void Setdepartment(String department) {
		this.department = department;
	}

	public String Getdepartment() {
		return department;
	}
	public void dispinfo() {
		System.out.println(department);
		super.dispinfo();
		
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.Setid(12);
		e.Setname("srikanth");
		e.Setsalary(1234);
		e.dispinfo();
		
		manager m=new manager();
		m.Setid(201);
		m.Setname("Mahesh");
		m.Setsalary(50000.00);
		m.Setdepartment("IT");
		m.dispinfo();
	}

	
}
