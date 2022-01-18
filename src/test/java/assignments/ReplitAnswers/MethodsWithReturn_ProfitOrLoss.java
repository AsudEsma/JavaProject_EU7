package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_ProfitOrLoss {

	public static String profits(int buyPrice,int sellPrice){
		//your code here
		   
		String status = "";
		if (sellPrice-buyPrice>0) {
			status = "profit";
		} else if (sellPrice-buyPrice<0) {
			status = "loss";
		} else {
			status = "no loss";
		}
		   return status;
		   
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(profits(in.nextInt(), in.nextInt()));
		in.close();
	}

}
