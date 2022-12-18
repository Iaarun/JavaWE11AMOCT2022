package abstractionDemo;

public class Square extends Shape {
	int side;

	public Square(String color, int side) {
		super(color);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {

		int area = side * side;

	}

}
