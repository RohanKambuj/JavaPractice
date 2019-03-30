package classAbstraction;

public class Rectangle extends Figure{
	
	int dim1, dim2;

	public int area(int dim1,int dim2) {
		System.out.println("Area of Rectangle is: "+(2*dim1*dim2));
		return (dim1*dim2);
	}
}