package classes.day34_constructor;

public class AppleTest {

	public static void main(String[] args) {
	
		Apple a1 = new Apple();
		System.out.println(a1.color);
		changeApple(a1);
		System.out.println(a1.color);
		System.out.println(methodObject().color);
	}
	
	public static void changeApple(Apple x) {
		
		x.color = "White";
		
	}
	
	public static Apple methodObject() {
		
		Apple b1 = new Apple();
		return b1;
	}

}
