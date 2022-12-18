package testproject;

import java.util.Arrays;

public class _008Stringdemo {
public static void main(String[] args) {
	Stringfunctions();
}

public static void createString() {
	//using String literal
	String name = "java";
	String name1 = "java";
	
	//using new keyword
	
	String str = new String("java").intern();
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
	
	str = "Java Test";
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	 System.out.println(str.contains("Te"));
	  String str1 = "java Test";
	  
	  System.out.println(str.equals(str1));
	  System.out.println(str.equalsIgnoreCase(str1));
	  
	 System.out.println(str.endsWith("st"));
	 System.out.println(str.startsWith(str1));
	 
	System.out.println(str.compareTo(str1));
	System.out.println(str.compareToIgnoreCase(str1));
	
	char[] chararr= str.toCharArray();
	System.out.println(Arrays.toString(chararr));
	
//	System.out.println(str.replace("a", "X"));
	System.out.println(str.indexOf("a"));
	System.out.println(str.lastIndexOf("a"));
	 
    String [] arr=	str.split("a");
    System.out.println(Arrays.toString(arr));
    
    System.out.println(str.substring(0,4));
    //abdc12521205@test.com abdc
    String email  = "abdc@test.com";
    System.out.println(email.substring(0, email.indexOf("@")));
    
	
}
}
