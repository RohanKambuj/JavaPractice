package circleAssignment;

public class CircleDemo {

	public static void main(String[] args) {
	
		Circle c1 = new Circle();
    	Circle c2 = new Circle(15.5,"blue");
		Circle c3 = new Circle(8.6,"yellow");
		Circle c4 = new Circle();
		
		c1.setRadius(11);
		c1.setColor("Green");
		
		c2.setRadius(10.5);
		c2.setColor("Blue");
		
		c3.setRadius(18);
		c3.setColor("Yellow");
		
	//	c4.setRadius(9.8);
	//	c4.setColor("Red");
		
		System.out.println("Radius, Color and Area of Circle 1:"+c1.getRadius()+"--"+c1.getColor()+"--"+c1.calculateArea());
		System.out.println("Radius, Color and Area of Circle 2:"+c2.getRadius()+"--"+c2.getColor()+"--"+c2.calculateArea());
		System.out.println("Radius, Color and Area of Circle 3:"+c3.getRadius()+"--"+c3.getColor()+"--"+c3.calculateArea());
		System.out.println("Radius, Color and Area of Circle 4:"+c4.getRadius()+"--"+c4.getColor()+"--"+c4.calculateArea());
		
	}

}
