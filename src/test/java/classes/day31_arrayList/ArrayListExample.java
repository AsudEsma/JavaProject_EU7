package classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("Italian");
		languages.add("Spanish");
		languages.add("Danish");
		languages.add("Russian");
		languages.add("German");
		languages.add("Arabic");
		languages.add("Turkish");
		languages.add("Chinese");
		languages.add("Japanise");
		languages.add("Korean");
		languages.add("Hindi");
		languages.add("Portuguese");
		languages.add("French");
		
		System.out.println("There are " + languages.size() + " languages in my array");
		for(int i=0; i<languages.size(); i++) {
			System.out.println("#" + (i+1) + ": " + languages.get(i));
		}
		
		languages.add("Bulgarian");
		languages.add(7, "Turkish");
		languages.set(3, "French");
		languages.set(13, "Danish");
		languages.remove(7);
		
		System.out.println("There are " + languages.size() + " languages in my array");
		for(int i=0; i<languages.size(); i++) {
			System.out.println("#" + (i+1) + ": " + languages.get(i));
		}
	}
}
