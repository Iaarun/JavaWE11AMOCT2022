package classesandObjects;

import java.util.Arrays;

/*
  Accessmodifier
  public 
  protected
  default
  private
 */
public class FunctionsDemo {
	public String str1;
	private String str2;
	protected String str3;
	String str4;

	// accessmodifier static/nonstatic returntype identifier ()

	public static void main(String[] args) {
		//test2("Rohit", 30);
		FunctionsDemo fd = new FunctionsDemo();
//		fd.testaccess1();
//		fd.testaccess2();
//		fd.testaccess3();
//		fd.testaccess4();
//		testStatic();
		
	double res=fd.add(10, 20);
	
	 String name= fd.sayMyname("Arun");
	 System.out.println(name);
	 
	  char[] arr= fd.StringtoCharArray("This is test");
	  
	  System.out.println(Arrays.toString(arr));
	}

	public static void test1() {
		System.out.println("Test1");
	}

	public static void test2(String name, int age) {
		System.out.println("Hello " + name + " and my age is " + age);
	}

	public void testaccess1() {
		System.out.println("TestAccess1");
	}

	private void testaccess2() {
		System.out.println("TestAccess2");
	}

	protected void testaccess3() {
		System.out.println("TestAccess3");
	}

	void testaccess4() {
		System.out.println("TestAccess4");
	}
	
	public static void testStatic() {
		System.out.println("Test Static function");
	}
	
	//return type
	
	 static public double add(int a, int b) {
		int  sum = a+b;
		return sum;
	}
	
	public String sayMyname(String name) {
		return "Hello "+name;
	}
	
	public char[] StringtoCharArray(String str) {
		
     return	str.toCharArray();
		
	}

}
