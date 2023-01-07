package abstractionDemo;

public class Circle extends Shape  {

	int radius;

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {

		double area = Math.PI * radius * radius;

		System.out.println(area);

	}

	public static void main(String[] args) {
   
	}

}