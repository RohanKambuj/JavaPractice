package classAbstraction;

public abstract class Figure {

	int area(int dim1){
		System.out.println("Area is: "+(dim1*dim1));
		return dim1;
	}
	
	abstract int area(int dim1,int dim2);
	
}