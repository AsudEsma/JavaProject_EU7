package assignmentLabs.Lab_1;

public class Q6 {

	public static void main(String[] args) {
			
			cigarParty(30, false);
			cigarParty(50, false);
			cigarParty(70, true);

			
		}
		

			public static void cigarParty(int c, boolean weekend) {
				
				if (weekend) {
					if (c>40) {
						System.out.println("true");
					}else {System.out.println(false);
					}
				} else 
				{if(c>40 && c<60) {
					System.out.println("true");
				}else {System.out.println(false);
				
				}
			}
	}
}
