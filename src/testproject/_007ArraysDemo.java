package testproject;

import java.util.Arrays;

public class _007ArraysDemo {
	public static void main(String[] args) {
		arriterate();
	}
	 public static void arriterate() {
		 int[] num = new int [5];
			num[0]=10;
			num[1]=60;
			num[2]=30;
			num[3]=81;
			num[4]=50;
			
			//using for loop
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
			
		int []num1=	Arrays.copyOf(num, 5);
		System.out.println(Arrays.toString(num1));
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	 }
	
	
	public static void arrayfill() {
		int[] num = new int [5];
		Arrays.fill(num, 10);
		System.out.println(Arrays.toString(num));
	}
	
	public static void arraybasic() {
		//define array
		
		int[] num = new int [5];
		
		System.out.println(num);
		
		System.out.println(num[0]);
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=41;
		num[4]=50;
		
		System.out.println(num[4]);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(Arrays.toString(num));
		
	}

}
