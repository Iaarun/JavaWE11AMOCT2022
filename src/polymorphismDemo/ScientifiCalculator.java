package polymorphismDemo;

public class ScientifiCalculator extends Calculator {
	int age = 30;

	public  void sayName(String name) {
		System.out.println("Hi " + name);
	}

	public static void main(String[] args) {
		ScientifiCalculator sc = new ScientifiCalculator();
		sc.sayName("Arun"); // Hi Arun
		System.out.println(sc.age); //30

		Calculator calc = new Calculator();
		calc.sayName("Arun"); // Hello Arun
		System.out.println(calc.age); //20

		Calculator cal1 = new ScientifiCalculator();
		cal1.sayName("Arun"); // Hi Arun
		System.out.println(cal1.age); //20

	}
}
