package Polymorphism;

public class Rectangle extends Shape{
	void area(double l, double b) {
		double result = l*b;
		System.out.println("Area of the Rectangle = " + result);
	}

	public static void main(String[] args) {
	      //Shape = s;
		//s = new Circle(10);
		//s.area();
		
		//Shape= s;
		//s = new Rectangle(10, 20);
		//s.area();
		
	Circle c = new Circle();
	c.area(10);
	Rectangle e = new Rectangle();
	e.area(12, 20);

	}

}
