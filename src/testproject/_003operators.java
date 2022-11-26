package testproject;

public class _003operators {
	public static void main(String[] args) {
		comparisonoperator();
	}

	public static void assignmentoperator() {
       // =
		int a =10;
		char ch = 'A';
		System.out.println(a);
	}
	
	public static void arithmeticOperator() {
		// +, -, *, /, %
		
		int a=10;
		int b =3;
		System.out.println(a+b); //13
		System.out.println(a-b);//7
		System.out.println(a*b);//30
		System.out.println(a/b);//3
		System.out.println(a%b);//1
	}
	
	public static void comparisonoperator() {
		// > < == !=  >=  <=
		int a=10;
		int b =3;
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b);  //true
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
	}
 
}
