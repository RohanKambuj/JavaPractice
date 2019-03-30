package classAbstraction;

public class FigureImpl {

	public static void main(String[] args) {
		
		Square sq = new Square(5);
		sq.area(8);
		
		Rectangle rect = new Rectangle();
		rect.area(5, 8);
	}

}
