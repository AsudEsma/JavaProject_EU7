package classes.day10_controlFlowStatements;

public class Task5_KPH_MPH_Calculator {

	public static void main(String[] args) {

		System.out.println("KPH\t\t\tMPH");
		
		for (int kph=60; kph<=130; kph+=10) {
			double mph = kph*0.6214;
			System.out.println(kph + "\t\t\t" + mph);
		}

	}

}
