package Inheritance;

public class FigureImp {

	public static void main(String[] args) {
//            Figure f = new Figure();
//            f.dim1=10;
//            f.dim2=12;
//            
            Circle circle = new Circle(5);
            //circle.dim1=5;
            circle.area();
            
            Rectangle rect = new Rectangle();
            rect.dim1=8;
            rect.dim2=5;
            rect.area();
	}

}
