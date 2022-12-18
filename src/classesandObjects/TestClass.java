package classesandObjects;

class Box{
	int length;
	int width;
	int height;
	
	public void area() {
		System.out.println("Area of a box");
	}
}

public class TestClass {
	public static void main(String[] args) {
//		Box squareBox = new Box();	
//		squareBox.length = 100;
//		squareBox.width= 150;
//		squareBox.height=200;
//		
//		squareBox.area();
		
		FunctionsDemo fd = new FunctionsDemo();
		
		fd.testaccess4();
		
		FunctionsDemo.testStatic();
	}

}
