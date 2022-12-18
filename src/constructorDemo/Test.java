package constructorDemo;

class Box {
	int length;
	int width;
	int height;

	public  Box(int length, int width, int height) {
		//calling non parameterised constructor
		this();
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("Paramterzied constructor");
	}
	
	Box(Box b){
		
	}

	Box() {
		//calling parametersied constructor
		//this(10, 15, 30);
		this.test();
		System.out.println("Box class constructor");
	}
	
	public void test() {
		System.out.println("Test Class functions");
	}
}

public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		Box box1 = new Box(10, 15, 20);
//    		 
     System.out.println(box.length);
     System.out.println(box.width);
     System.out.println(box.height);
     
     Box b2 = new Box(new Box());
	}
}
