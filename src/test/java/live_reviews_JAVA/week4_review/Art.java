package live_reviews_JAVA.week4_review;

public class Art {

	public static void draw() {
		System.out.println("Basic drawing");
	}
	
	public static void draw(String color) {
		System.out.println("Drawing with " + color);
	}
	
	public static void draw(int size) {
		draw("green");
		System.out.println("Drawing with " + size);
	}
	
	public static String draw(String color, int size) {
		String result = "Drawing with " + color + " and size " + size;
		return result;
	}
	
	public static void main(String[] args) {
		
		draw();
		draw("red");
		draw(5);
		draw("yellow",8);
		System.out.println(draw("yellow",8));
		
		String drawingResults = draw("orange",12);
		System.out.println(drawingResults);
		
	}
}