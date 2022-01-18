package assignments.ReplitAnswers;

import java.util.Scanner;

public class AverageTemperature {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
		scan.close();
		
		for(double each : temps) {
			total += each;
		}
		
		avgTemp = total / temps.length;
		System.out.println(avgTemp);
	
	}

}
