package classes.day33_classObject_Constructors;

public class Rectangle {

	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}

	public Rectangle(double a, double b) {
		length = a;
		width = b;
	}
}
