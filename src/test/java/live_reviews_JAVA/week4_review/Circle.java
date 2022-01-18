package live_reviews_JAVA.week4_review;

public class Circle {

	// attributes: radius
	// actions/methods: area():r*r*Pi , perimeter();2*r*Pi
	
	double radius; //also variables can have accessModifier like methods
	double Pi = 3.14; //Math.PI
	
	public double area() {
		return radius*radius*Pi;
	}
	
	public double perimeter() {
		return 2*radius*Pi;
	}
	
	public String toString() {
		return "Radius: " + radius
				+ ", Area: " + area()
				+ ", Perimeter: " + perimeter();
	}
	
}
