package testproject;

public class _008Stringdemo {
public static void main(String[] args) {
	Stringfunctions();
}

public static void createString() {
	//using String literal
	String name = "java";
	String name1 = "java";
	
	//using new keyword
	
	String str = new String("java");
	String str1 = new String("java");
	
	if(str==name) {
		System.out.println("stored at same add");
	}else {
		System.out.println("stored at diff add");
	}
	
}


public static void Stringfunctions() {
	
	String str = "Ja  va ";
	
	 str.concat(" test");
	
	System.out.println(str);
	
	System.out.println(str.length());
	System.out.println(str.trim());
	System.out.println(str.charAt(0));
	
	
}
}
