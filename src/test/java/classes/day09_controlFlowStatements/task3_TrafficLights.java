package classes.day09_controlFlowStatements;

public class task3_TrafficLights {

	public static void main(String[] args) {

		char light = 'R';
		
		switch (light) {
		case 'R':
		case'r':
			System.out.println("Red");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'G':
		case 'g':
			System.out.println("Green");
			break;
		default:
			System.out.println("Invalid entry.");
		}
	}

}
