package live_reviews_JAVA.week7_review;

import java.util.ArrayList;

public class R11_ArrayListObjects {
	
	public static void main(String[] args) {

		Products productOne = new Products();
		productOne.setInfo("sonyVaio", 950.0);
		
		Products productTwo = new Products();
		productTwo.setInfo("iphone12", 1350.0);
		
		Products productThree = new Products();
		productThree.setInfo("monitor", 350.0);
		
		// what are the objects  : productOne, productTwo, productThree
		// what is my class name : Products
		// what is the method    : setInfo
		
		ArrayList<Products> list = new ArrayList<>();
		list.add(productOne);
		list.add(productTwo);
		list.add(productThree);
		
		for(Products each : list) {
			System.out.println(each);
		}
	}
}
