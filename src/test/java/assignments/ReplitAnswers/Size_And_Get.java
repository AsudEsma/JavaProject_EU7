package assignments.ReplitAnswers;

import java.util.ArrayList;
import java.util.Scanner;

public class Size_And_Get {

	public static int sum(ArrayList<Integer> nums)	{
		//write code here
		int sum = 0;
		for(Integer each : nums) {
			sum += each;
		}
		
		return sum;

	}

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextInt());
    } in.close();

    System.out.println(sum(list));

  } 
	
}
