package testproject;

import java.util.Scanner;

//WAP to take two number input from user and perform addition
public class _004UserInput {

	public static void main(String[] args) {
		twonumberadd();
	}
	
	public static void userinput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Say your name");
		String name = in.next();

		System.out.println("Say your age");
		int age = in.nextInt();

		System.out.println("Allowed to vote");
		boolean flag = in.nextBoolean();
		
		System.out.println("Enter any decimal number");
	 	 double num= in.nextDouble();
	 	 
	 	System.out.println("Enter any character ");
	 	char ch= in.next().charAt(0);
	 	 
	 	 System.out.println(name+"\n"+age+"\n"+flag+"\n"+num+"\n"+ch);
	}
	
	public static void twonumberadd() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		  String c = in.next();		
		int res = a+b;
		System.out.println(res);
		
	}
	
	

}
