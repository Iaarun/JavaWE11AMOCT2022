package testproject;

import java.util.Scanner;

/*
 * if(condition){
 *   code
 * }
 
 Take three number inputfrom user. Calculate the % and based on % provide 
 91-100  A+
 81-90 A
 71-80 B+
 61-70 B
 50-60 C
 40-50 D
 40<   fail
 
  2- Take two number input from user and perform 
  Arithmetic operation of user choice
 */
public class _005DecisionMaking {
	static Scanner in = new Scanner(System.in);
	 public static void main(String[] args) {
		 switchCaseSignal();
	}
	public static void voting() {
		System.out.println("Programm Starts");
		
		System.out.println("Enter age");
		int age = in.nextInt();
		
		if(age>18) {
			System.out.println("Allowed to vote");
		}else {
			System.out.println("Minors not allowed");
		}
		
		
		System.out.println("Programm Ends");
		
	}

	
	//nestedif
	public static void blooddonation() {
		System.out.println("Enter age");
		int age = in.nextInt();
// 17	19 47	 20 65
		if(age>=18) {
			System.out.println("Enter weight");
			int wt = in.nextInt();
			
			if(wt>=50) {
				System.out.println("Fit for donation");
			}else {
				System.out.println("Under wt not allowed");
			}
			
		}else {
			System.out.println("Minors not allowed to donate");
		}
	}
	
	//ladderif   if else-if
	public static void trafficSignal() {
		System.out.println("Check signal ");
		String checksignal = in.next();
	// kjhik	
		if(checksignal.equalsIgnoreCase("green")) {
			System.out.println("GO");
		}else if(checksignal.equalsIgnoreCase("orange")) {
			System.out.println("BE READY");
		}else if(checksignal.equalsIgnoreCase("red")) {
			System.out.println("STOP");
		}else {
			System.out.println("BE CAREFULL");
		}
	}
	
	
	public static void switchCaseSignal() {
		System.out.println("Check signal ");
		String checksignal = in.next();
		
		switch(checksignal.toLowerCase()) {
		case "green":
			System.out.println("GO");
			break;
		case "red":
			System.out.println("STOP");
			break;
		case "orange":
			System.out.println("BE READY");
			break;
		default:
			System.out.println("BE CAREFULL");
		}
	}
	
	
	
	
}
