package classes.day35_encapsulation;

import java.util.ArrayList;

public class RoulettePocket {

	private ArrayList<String> roulette;

	public RoulettePocket() {
		roulette = new ArrayList<>(36);
	}

	public void getPocketColor(int num) {
	
		for(int i=0; i<=36; i++) {
            if(i==0){
                roulette.add(0, "green");
			} else if(i>0 && i<11 || i>18 && i<29) {
				if(i%2==0) {
					roulette.add(i, "black");
				} else {
					roulette.add(i, "red");
				}
			} else if(i>10 && i<19 || i>28 && i<37) {
				if(i%2==0) {
					roulette.add(i, "red");
				} else {
					roulette.add(i, "black");
				}
			}
		
		}
		
		System.out.println(roulette.get(num));
	}
	
	
}
