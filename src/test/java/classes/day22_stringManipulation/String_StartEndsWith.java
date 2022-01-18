package classes.day22_stringManipulation;

public class String_StartEndsWith {

	public static void main(String[] args) {

		String w1 = "Eclipse";
		
		System.out.println(w1.startsWith("E"));
		System.out.println(w1.startsWith("Ec"));
		System.out.println(w1.startsWith("Ex"));
		System.out.println(w1.endsWith("e"));
		System.out.println(w1.endsWith("se"));
		System.out.println(w1.endsWith("E"));
		
		//Mr. = > married man
		//Mrs. = > married woman
		//Ms. = > Some woman
		//Dr. = > Doctor man or woman
		//No title  = > Unknown status
				
		String name = "Dr. Jackson";
				
		if(name.startsWith("Mr.")) {
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknow status");
		}

	}

}
