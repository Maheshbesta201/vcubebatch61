package com.oops;

public class Employee {
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

