package polymorphismDemo;

import java.util.Scanner;

public class Calculator {
	int age = 20;

	private void add() {
		System.out.println("add fucntion");
	}

	// changing the number of parameter
	protected void add(int a, int b) {
		System.out.println("add fucntion");
	}

	// changing the type of parameter
	public void add(int a, double b) {
		System.out.println("add fucntion");
	}

	// changing the sequence of parameter
	public void add(double a, int b) {
		System.out.println("add fucntion");
	}

	public static void test() {
		System.out.println("Static non parameterized function");
	}

	public static void test(String name) {
		System.out.println("Static parameterized function");
	}

	public  void sayName(String name) {
		System.out.println("Hello " + name);
	}

	// cannot acheive overloading by changing the return type
//	public double add(double a, int b) {
//		System.out.println("add fucntion");
//		return 0.0;
//	}

	public static void main(String[] args) {
          Calculator cal = new Calculator();
          cal.add(20.25, 30);
	}

	public static void main(int[] args) {

	}

}
