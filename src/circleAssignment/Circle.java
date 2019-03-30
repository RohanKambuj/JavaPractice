package circleAssignment;

public class Circle {

		private double radius;
		private String color;

	public Circle (double radius, String color) {
		this.radius=radius;
		this.color=color;
	}

	
	public Circle() {
		radius=5;
		color= "Red";
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double calculateArea() {
		double area;
		area=radius*radius*Math.PI;
		return area;
	}
}
