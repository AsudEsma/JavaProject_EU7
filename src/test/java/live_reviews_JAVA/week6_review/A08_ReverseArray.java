package live_reviews_JAVA.week6_review;

import java.util.Arrays;

public class A08_ReverseArray {

	public static void main(String[] args) {

		int[] num = {5, 10, 4, 100}; //[100, 4, 10, 5]
		int[] reverse = new int[num.length];
		
		for(int i = 0; i < num.length; i++) {
            reverse[i] = num[num.length -1 -i];
        }

		System.out.println(Arrays.toString(reverse));
		
		int j=0;
		for(int i = 0; i < num.length; i++) {
            reverse[j] = num[i];
            j++;
        }
		
		System.out.println(Arrays.toString(reverse));
		
		//creating a third variable to hold my array variables		
		int x = 5;  // 5
		int y = 10;  // 100 
		int temp;
		// swapping numbers
		temp = x;
		x=y;
		y=temp;
		System.out.println("x : "+ x + " y "+ y ); 
		
		System.out.println("Print before swap: "+ Arrays.toString(num));
	// int [] num = {5, 10 , 4, 100};  
		for (int i = 0; i < num.length/2 ; i++) {
			int temp2 = num[i];
			num[i] = num[num.length-1-i]; // 4 - 1 - 0 = 3 / 4 - 1 -1 = 2
			num[num.length-1-i] = temp2;
		}
		System.out.println("Print after swap: "+ Arrays.toString(num));
		
		
	}

}
