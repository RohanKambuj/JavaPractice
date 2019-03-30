package classAbstraction;

public class Square extends Figure{

	int dim1;

	Square(int dim1){
		System.out.println("Area of Square is: "+(dim1*dim1));
	}
	
	@Override
	int area(int dim1, int dim2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
