package testproject;

public class _003operators {
	public static void main(String[] args) {
		findmaxofthree();
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
	
	public static void logicalcondition() {
		int a=10;
		int b =3;
		
		System.out.println((a>b) && (a<b)); //FALSE
		System.out.println((a>b) && (b<=a));//TRUE
		System.out.println((a>b) || (a<b)); //TRUE
	}
	
	public static void ternaryOperator() {
		// (condition)? expression1: expression2
		
		int a=10;
		int b =13;
		int result= (a<b) ? (a+b): (a*b);
		System.out.println(result);
	}
	
	public static void findmaxofthree() {
		int a=24, b=35, c=25;
	int max=	(a>b)? ((a>c)? a:c): ((b>c)?b:c);
	System.out.println(max);
	}
 
}
