package Inheritance;

public class Circle extends Figure{

	
	public Circle(double radius) {
		dim1=radius;
	}

	public void area() {
	
		System.out.println("Area of Circlr:"+(3.142*dim1*dim1));

	}
}
