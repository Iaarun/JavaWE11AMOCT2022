package testproject;

/*
 local 
 instance 
 class
 */
public class _001VariableDemo {

	String StName;

	static String courseName;

	public static void main(String[] args) {

		// datatype refname = value;

		int age = 20;
		String name = "Arun";
		int num = 10;
		
		_001VariableDemo obj1 = new _001VariableDemo();
		
		_001VariableDemo obj2 = new _001VariableDemo();
		
		obj1.StName="Arun";
		courseName = "Selenium";
		
		obj2.StName="Amit";
		
		obj1.StName = "Rahul";
		courseName = "Java";
		System.out.println(obj1.StName); //Rahul
		System.out.println(obj1.courseName); //Java
		System.out.println(obj2.StName); //Amit
		System.out.println(obj2.courseName); //Java
		
	}

}
