package testproject;

import java.util.Scanner;

/*
 * if(condition){
 *   code
 * }
 */
public class _005DecisionMaking {
	
	 public static void main(String[] args) {
		voting();
	}
	public static void voting() {
		System.out.println("Programm Starts");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age");
		int age = in.nextInt();
		
		if(age>18) {
			System.out.println("Allowed to vote");
		}else {
			System.out.println("Minors not allowed");
		}
		
		
		System.out.println("Programm Ends");
		
	}

}
