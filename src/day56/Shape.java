package day56;

public abstract class Shape {

	String color;
	
	public abstract void calculatePerimeter();
	public abstract double calculateArea();
	@Override
	public abstract String toString();
	
}

class Circle extends Shape{
	
	double radius;
	
	

	public Circle(String color,double radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Rectangle extends Shape{
	
	protected double width;
	protected double height;
	
	public Rectangle(String color,double width,double height) {
		this.color=color;
		this.width=width;
		this.height=height;
			}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle("black", 1.3);
		Rectangle r = new Rectangle("blue",1.2,1.4);
	}
	
}

