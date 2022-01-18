package assignments.ReplitAnswers;

public class UtopianTree {

	public static void main(String[] args) {
		
		int year = 0;
		int treeSize = 0;
		do {
			if (year<3) {
				year++;
				System.out.println("year " + year + " - growth 1 cm");
				treeSize+=1;
				System.out.println("tree size: " + treeSize + "cm");
			} else {
				year++;
				System.out.println("year " + year + " - growth 2 cm");
				treeSize+=2;
				System.out.println("tree size: " + treeSize + "cm");
			}	
			
		} while (year<10);

		   
	}
}
