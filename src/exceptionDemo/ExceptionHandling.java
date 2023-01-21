package exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
  try{
   code
  }catch(){
     handleException
  }
 */
public class ExceptionHandling {
	
	public static void main(String[] args) throws InvalidAgeException {
	//	 exception1();
		ExceptionHandling eh = new ExceptionHandling();
		eh.validateAge(17);
		
	}
	
	public static void fileHandle() throws FileNotFoundException {
		
		File file = new File("");
		FileInputStream fis = new FileInputStream(file);
	}
	
	
	public static void exception1() {
		
		System.out.println("Programm Starts");
		int [] arr= {12,15,48,565,97,35};
		try {
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch (Exception e) {
	      e.printStackTrace();
		}finally {
			System.out.println("finally Block");
		}
		System.out.println("Programm Ends");
	}
	
	
	public void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid age Exception : Less than 18");
		}else {
			System.out.println("Allows to vote");
		}
	}

}
