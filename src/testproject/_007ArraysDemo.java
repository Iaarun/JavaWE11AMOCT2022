package testproject;

import java.util.Arrays;
import java.util.Scanner;

public class _007ArraysDemo {
	public static void main(String[] args) {
		twodimentionalarray();
	}
	public static void twodimentionalarray() {
		int [][]arr = new int [2][3];
		arr[0][0]=10;
		arr[0][1]=40;
		arr[0][2]=80;
		arr[1][0]=11;
		arr[1][1]=12;
		arr[1][2]=13;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void maxandmininarray() {
		int [] arr= {21,54,75,64};
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		
		System.out.println("Max : "+max);
	}
	
	public static void createArray() {
		int [] arr= {21,54,54,64};
		Scanner sc = new Scanner(System.in);
		System.out.println("Which size array");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		
		System.out.println("enter "+size+" data in array");
		for(int i=0; i<arr1.length ; i++) {
			arr1[i]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			 sum = sum +arr1[i];
		}
		
		System.out.println(sum);
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
		num[0] = 21;
		
		System.out.println(num[4]);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(Arrays.toString(num));
		
	}

}
