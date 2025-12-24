package javaConstructor;

public class First {
	String name;
	int pin;

	First() {
		System.out.println("no arg constructor");

	}

	First(String name, int pin) {
		this.name = name;
		this.pin = pin;
		System.out.println("parametarized constructor");

	}

	void show() {
		System.out.println(name);
		System.out.println(pin);
	}

	public static void main(String[] args) {
		First f = new First();
		f.show();

		First f1 = new First("mahesh", 201);
		f1.show();

	}

}
