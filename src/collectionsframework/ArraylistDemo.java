package collectionsframework;

import java.util.ArrayList;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		
	}
	
	public void wrapperexample() {
		int a = 10;
		Integer i1 = new Integer(a);//autoboxing
		
		int a2 = i1; //unboxing
	}
	
	public void arrayListBasic() {
		ArrayList <String>li = new ArrayList<>();
		li.add("Test");
		li.add("Test2");
		
	}

}
