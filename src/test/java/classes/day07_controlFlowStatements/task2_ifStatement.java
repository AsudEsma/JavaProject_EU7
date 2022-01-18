package classes.day07_controlFlowStatements;

public class task2_ifStatement {

	public static void main(String[] args) {

		int amountOfWatermelons;
		boolean lotsOfWatermelon;
		
		amountOfWatermelons = 20;
		lotsOfWatermelon = false;
		
		if(amountOfWatermelons > 20) {
			System.out.println("I have more than 20 watermelon.");
			lotsOfWatermelon = true;
		}
		
		if (lotsOfWatermelon == true) {
			System.out.println("Great job!");
		}
		
		if (lotsOfWatermelon == false) {
			System.out.println("I need more watermelon.");
		}

	}

}
