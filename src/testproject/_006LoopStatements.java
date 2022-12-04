package testproject;

import java.util.Scanner;

/*
  for(intialization; condition; increment/decrement;)
 */
public class _006LoopStatements {
	public static void main(String[] args) {
		whiledemo();
	}

	public static void forLoop() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void sumofFirst50Numbers() {
		int sum = 0;

		for (int i = 1; i <=10; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}
	
	public static void findFactorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}
	
	public static void patter1() {
		//number of rows
		for(int i=1; i<=4; i++) {
			//number fo columns
			for(int j=1; j<=5; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void patter2() {
		//number of rows
		for(int i=1; i<=4; i++) {
			//number fo columns
			for(int j=1; j<=i; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void whilefactorialDemo() {
		/*
		  initialization;
		  while(condition){
		    code
		    increment/decrement
		  }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int fact = 1;
		
		int i=1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		
		System.out.println(fact);
	}
	
	public static void whiledemo () {
	 int num1 = 10, num2=20;
	 
	 while(num1<num2) {
		 System.out.println("hello");
		 num1++;
		 num2--;
	 }
	 
	}
}
