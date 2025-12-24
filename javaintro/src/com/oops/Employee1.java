package com.oops;

public class Employee1 {
	private String name;
	private int id;
	private double salary;

	public void Setname(String name) {
		this.name = name;
	}

	public String Getname() {
		return name;
	}

	public void Setid(int id) {
		this.id = id;
	}

	public int Getid() {
		return id;
	}

	public void Setsalary(double salary) {
		this.salary = salary;
	}

	public double Getsalary() {
		return salary;
	}

	public void dispinfo() {
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
	}
}

class manager1 extends Employee1{

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
		Employee1 e=new Employee1();
		e.Setid(12);
		e.Setname("srikanth");
		e.Setsalary(1234);
		e.dispinfo();
		
		manager1 m=new manager1();
		m.Setid(201);
		m.Setname("Mahesh");
		m.Setsalary(50000.00);
		m.Setdepartment("IT");
		m.dispinfo();
	}

	
}
