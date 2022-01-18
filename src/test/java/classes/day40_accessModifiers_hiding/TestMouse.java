package classes.day40_accessModifiers_hiding;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		
		mouse.getRodentDetails();
		// We are hiding the child value
		
		mouse.getMouseDetails();
	}
}
